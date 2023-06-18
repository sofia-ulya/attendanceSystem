package my.edu.utem.ftmk.dad.attendancesystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import my.edu.utem.ftmk.dad.attendancesystem.model.Attendance;
import my.edu.utem.ftmk.dad.attendancesystem.model.Examination;
import my.edu.utem.ftmk.dad.attendancesystem.repository.AttendanceRepository;

@Controller
public class AttendanceMenuController {

	private String defaultURI = "http://localhost:8080/attendancesystem/api/attendances";
	
	
	
	@RequestMapping("/attendance/save")
    public String insertAttendance(@ModelAttribute Attendance attendance) {

	RestTemplate restTemplate = new RestTemplate();

        // Create a request body
        HttpEntity<Attendance> request = new HttpEntity<>(attendance);

        // Send a POST request to save the attendance
        String attendanceResponse = restTemplate.postForObject(defaultURI, request, String.class);

        System.out.println(attendanceResponse);

        // Redirect to the examination list page
        return "redirect:/examination/list";
    }
}
	   

