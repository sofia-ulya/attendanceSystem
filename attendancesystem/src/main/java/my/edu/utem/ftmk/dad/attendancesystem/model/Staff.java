package my.edu.utem.ftmk.dad.attendancesystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * This class represents a staff in the system.
 * The student class contains information about a staff, such as their ID and name.
 * 
 * The class provides method to retrieve and update staff information.
 * 
 * The staff data is used for various purposes, such as in examination records.
 * 
 * @author ezzajeslin
 *
 */

@Entity
@Table(name="staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="staffId")
	private int staffId;
	
	@Column (name="staffName")
	private String staffName;
	
	@Column (name="staffEmail")
	private String staffEmail;
	
	@Column (name="staffPhoneNo")
	private String staffPhoneNo;

	//getter and setters for the staff variables.
	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffPhoneNo() {
		return staffPhoneNo;
	}

	public void setStaffPhoneNo(String staffPhoneNo) {
		this.staffPhoneNo = staffPhoneNo;
	}
	
	

}
