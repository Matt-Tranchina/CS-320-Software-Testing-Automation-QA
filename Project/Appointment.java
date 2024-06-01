/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Appointment
 *
 * The purpose of Appointment is to create an appointment with a unique
 * ID, a date that is a future date, and a description.
 */

package Project;

import java.time.LocalDate;

public class Appointment {
	
	private String appointmentID;
	private LocalDate appointmentDate;
	private String appointmentDescription;
	
	//Constructor
	public Appointment(String ID, LocalDate date, String descript) {
		//Acquire the current date
		LocalDate currentDate = LocalDate.now();
		
		//Validate all requirements are met
		
		//Appointment ID is less than 10 characters and not NULL
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID, must be at least one (1) character and less than ten (10) characters");	
		}
		this.appointmentID = ID;
		
		//Appointment date did not yet pass and is not NULL
		if(date == null || date.isBefore(currentDate)) {
			throw new IllegalArgumentException("Invalid Date, must be an upcoming date in (YYYY, MM, DD) format");	
		}
		this.appointmentDate = date;
		
		//Appointment description is less than 50 characters and is not NULL
		if(descript == null || descript.length() > 50) {
			throw new IllegalArgumentException("Invalid Description, must be at least one (1) character and less than fifty (50) characters");
		}
		this.appointmentDescription = descript;
	}
	
	//Setters
	
	public void setAppointmentID(String ID) {
		this.appointmentID = ID;
	}
	
	public void setAppointmentDate(LocalDate date) {
		this.appointmentDate = date;
	}
	
	public void setAppointmentDescription(String descript) {
		this.appointmentDescription = descript;
	}

	
	//Getters
	
	public String getAppointmentID() {
		return appointmentID;
	}
	
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
}
