package my.edu.utem.ftmk.dad.attendancesystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import my.edu.utem.ftmk.dad.attendancesystem.model.Attendance;

@Controller
public class AttendanceMenuController {

	private String defaultURI = "http://localhost:8080/orderapp/api/attendances";
	
	@GetMapping("/attendance/list")
	public String getProductTypes(Model model) {
		
		//The URI for GET order types
		String uri = "http://localhost:8080/orderapp/api/attendances";
		
		//Get a list order types from the web service
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Attendance[]> response = restTemplate.getForEntity(uri, Attendance[].class);
		
		//Parse JSON data to array of object
		Attendance attendances[] = response.getBody();
		
		//Parse an array to a list object
		List<Attendance> attendanceList = Arrays.asList(attendances);
		
		//Attach list to model as attribute
		model.addAttribute("attendances", attendanceList);
		
		return "attendances";
	}
	
	@GetMapping("/attendance/{attendanceId}")
	public String getAttendance (@PathVariable Integer attendanceId, Model model) {
		String pageTitle = "New Attendance";
		Attendance attendance = new Attendance();
		
		//This block get an product type to be updated
		if(attendanceId > 0) {
			
			//Generate new URI and append productTypeId to it
			String uri = defaultURI + "/" + attendanceId;
			
			//Get an product type from the web service
			RestTemplate restTemplate = new RestTemplate();
			attendance =  restTemplate.getForObject(uri, Attendance.class);
			
			
		}
		//Attach value to pass to front end
		model.addAttribute("attendance", attendance);
		model.addAttribute("pageTitle", pageTitle);
		
		return "attendanceinfo";
	}
}
