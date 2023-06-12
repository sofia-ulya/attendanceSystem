package my.edu.utem.ftmk.dad.attendancesystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * This class represents subjects in the system.
 * The student class contains information about a subject, such as their ID and name.
 * 
 * The class provides method to retrieve and update subject information.
 * 
 * The student data is used for various purposes, such as examination records.
 * 
 * @author ezzajeslin
 *
 */

@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="SubjectId")
	private int subjectId;
	
	@Column (name="SubjectCode")
	private String subjectCode;
	
	@Column (name="SubjectName")
	private String subjectName;

	//getter and setters for the subject variables.
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
