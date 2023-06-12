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

import my.edu.utem.ftmk.dad.attendancesystem.model.Subject;
import my.edu.utem.ftmk.dad.attendancesystem.repository.SubjectRepository;

@RestController
@RequestMapping("/api/subjects")
public class SubjectRESTController {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@GetMapping
	public List<Subject> getSubject()
	{
		return subjectRepository.findAll();
	}
	
	@GetMapping("{subjectId}")
	public Subject getSubject(@PathVariable long subjectId)
	{
		Subject subject = subjectRepository.findById(subjectId).get();
		return subject;
	}
	
	@PostMapping()
	public Subject insertSubject(@RequestBody Subject subject)
	{
		return subjectRepository.save(subject);
	}
	
	@PutMapping()
	public Subject updateSubject(@RequestBody Subject subject) {
		return subjectRepository.save(subject);
	}
	
	@DeleteMapping("{subjectId}")
	public ResponseEntity<HttpStatus> deleteSubject(@PathVariable long subjectId){
		subjectRepository.deleteById(subjectId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
