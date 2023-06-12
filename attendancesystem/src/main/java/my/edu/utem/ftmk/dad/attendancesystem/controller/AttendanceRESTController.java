package my.edu.utem.ftmk.dad.attendancesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.ftmk.dad.attendancesystem.model.Attendance;
import my.edu.utem.ftmk.dad.attendancesystem.repository.AttendanceRepository;

@RestController
@RequestMapping("/api/attendances")
public class AttendanceRESTController {

	@Autowired
	private AttendanceRepository attendanceRepository;
	
	@GetMapping
	public List<Attendance> getAttendance()
	{
		return attendanceRepository.findAll();
	}
	
	@GetMapping("{attendanceId}")
	public Attendance getAttendance(@PathVariable long attendanceId)
	{
		Attendance attendance = attendanceRepository.findById(attendanceId).get();
		return attendance;
	}
	
	@PostMapping()
	public Attendance insertAttendance(@RequestBody Attendance attendance)
	{
		return attendanceRepository.save(attendance);
	}
	
	/*
	  @PutMapping() public Attendance updateAttendance(@RequestBody Attendance
	  attendance) { return attendanceRepository.save(attendance); }
	  
	  @DeleteMapping("{attendanceId}") public ResponseEntity<HttpStatus>
	  deleteAttendance(@PathVariable long attendanceId) {
	  attendanceRepository.deleteById(attendanceId); return new
	  ResponseEntity<>(HttpStatus.OK); }
	 */
	
}
