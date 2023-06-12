package my.edu.utem.ftmk.dad.attendancesystem.model;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * This class represents list of examination for students in the system.
 * This class contains information about an examination details such as date, start time and end time .
 * 
 * The class provides method to retrieve and update examination.
 * 
 * The examination data is used for various purposes, such as in attendance records.
 * 
 * @author ezzajeslin
 *
 */

@Entity
@Table(name="examination")
public class Examination {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="examId")
	private int examId;
	
	@Column (name="examDate")
	private Date examDate;
	
	@Column (name="examLocation")
	private String examLocation;
	
	@Column (name="examStartTime")
	private LocalTime examStartTime;
	
	@Column (name="examEndTime")
	private LocalTime examEndTime;
	
	@ManyToOne
    @JoinColumn(name="staffId")
    private  Staff staff;
	
	@ManyToOne
    @JoinColumn(name="registerId")
    private  RegistrationSubject registrationSubject;
	
	//getter and setters for the examination's variables.
	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getExamLocation() {
		return examLocation;
	}

	public void setExamLocation(String examLocation) {
		this.examLocation = examLocation;
	}

	public LocalTime getExamStartTime() {
		return examStartTime;
	}

	public void setExamStartTime(LocalTime examStartTime) {
		this.examStartTime = examStartTime;
	}

	public LocalTime getExamEndTime() {
		return examEndTime;
	}

	public void setExamEndTime(LocalTime examEndTime) {
		this.examEndTime = examEndTime;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public RegistrationSubject getRegistrationSubject() {
		return registrationSubject;
	}

	public void setRegistrationSubject(RegistrationSubject registrationSubject) {
		this.registrationSubject = registrationSubject;
	}
	
	
	
	

}
