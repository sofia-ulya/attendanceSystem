package my.edu.utem.ftmk.dad.attendancesystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 * This class represents list of subject and student registered in the system.
 * This class contains information about a student, subject such as register ID, student Id and subject ID .
 * 
 * The class provides method to retrieve and update registration subject.
 * 
 * The data in this class is used for various purposes, such as in registered subject and student records.
 * 
 * @author ezzajeslin
 *
 */


@Entity
@Table(name="registrationsubject")
public class RegistrationSubject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="registerId")
	private int registerId;
	
	@ManyToOne
    @JoinColumn(name="SubjectId")
    private  Subject subject;
	
	@ManyToOne
    @JoinColumn(name="StudentId")
    private  Student student;

	//getter and setters for the registration subject's variables.
	public int getRegisterId() {
		return registerId;
	}

	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

}
