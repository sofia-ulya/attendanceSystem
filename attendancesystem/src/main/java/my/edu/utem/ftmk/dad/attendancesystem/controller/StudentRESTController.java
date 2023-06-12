package my.edu.utem.ftmk.dad.attendancesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.ftmk.dad.attendancesystem.model.Student;
import my.edu.utem.ftmk.dad.attendancesystem.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentRESTController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping
	public List<Student> getStudent()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("{studentId}")
	public Student getStudent(@PathVariable long studentId)
	{
		Student student = studentRepository.findById(studentId).get();
		return student;
	}
	@PostMapping()
	public Student insertStudent(@RequestBody Student student)
	{
		return studentRepository.save(student);
	}
	
	@PutMapping()
	public Student updateStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	

}
