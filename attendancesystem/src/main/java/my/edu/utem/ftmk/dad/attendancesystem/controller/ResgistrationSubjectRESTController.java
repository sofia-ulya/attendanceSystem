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

import my.edu.utem.ftmk.dad.attendancesystem.model.RegistrationSubject;
import my.edu.utem.ftmk.dad.attendancesystem.repository.RegistrationSubjectRepository;

@RestController
@RequestMapping("/api/registrationsubjects")
public class ResgistrationSubjectRESTController {
	
	@Autowired
	private RegistrationSubjectRepository registrationSubjectRespository;
	
	@GetMapping
	public List<RegistrationSubject> getRegistrationSubject()
	{
		return registrationSubjectRespository.findAll();
	}
	
	@GetMapping("{registerId}")
	public RegistrationSubject getRegistrationSubject(@PathVariable long registerId)
	{
		RegistrationSubject registrationSubject = registrationSubjectRespository.findById(registerId).get();
		return registrationSubject;
	}
	
	@PostMapping()
	public RegistrationSubject insertRegistrationSubject(@RequestBody RegistrationSubject registrationSubject)
	{
		return registrationSubjectRespository.save(registrationSubject);
	}
	
	@PutMapping()
	public RegistrationSubject updateRegistrationSubject(@RequestBody RegistrationSubject registrationSubject) {
		return registrationSubjectRespository.save(registrationSubject);
	}
	

}
