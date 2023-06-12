package my.edu.utem.ftmk.dad.attendancesystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import my.edu.utem.ftmk.dad.attendancesystem.model.Examination;


@Controller
public class ExaminationMenuController {
	
	private String defaultURI = "http://localhost:8080/attendancesystem/api/examinations";
	
	@GetMapping("/examination/list")
	public String getExaminations(Model model) {
		
		//The URI for GET order types
		String uri = "http://localhost:8080/orderapp/api/ordertypes";
		
		
		//Get a list order types from the web service
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Examination[]> response = restTemplate.getForEntity(uri, Examination[].class);
		
		
		
		//Parse JSON data to array of object
		Examination examinations[] = response.getBody();
		
		
		//Parse an array to a list object
		List<Examination> examinationList = Arrays.asList(examinations);
		
		//Attach list to model as attribute
		model.addAttribute("examinations", examinationList);
		
		return "examinations";
	}
	
	

}
