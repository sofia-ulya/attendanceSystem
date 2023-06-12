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
 * This class represents a student in the system.
 * The student class contains information about a student, such as their ID and name.
 * 
 * The class provides method to retrieve and update student information.
 * 
 * The student data is used for various purposes, such as attendance and examination records.
 * 
 * @author ezzajeslin
 *
 */

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="StudentId")
	private int studentId;
	
	@Column (name="StudentName")
	private String studentName;
	
	@Column (name="MatricNo")
	private String matricNo;
	
	@Column (name="StudentEmail")
	private String studentEmail;
	
	@Column (name="StudentPhoneNo")
	private String studentPhoneNo;
	
	@ManyToOne
    @JoinColumn(name="staffId")
	private Staff staff;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMatricNo() {
		return matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhoneNo() {
		return studentPhoneNo;
	}

	public void setStudentPhoneNo(String studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	
	
	
}
