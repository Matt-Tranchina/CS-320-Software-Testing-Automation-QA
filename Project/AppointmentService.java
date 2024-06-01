/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Appointment Service 
 *
 * The purpose of Appointment Service is to add an appointment to
 * a list. Once added, user can delete appointment by searching with
 * unique ID.
 */

package Project;

import java.util.ArrayList;

public class AppointmentService {
	
	//Create a list for appointments
	private ArrayList<Appointment>appointments = new ArrayList<Appointment>();
	
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	//Ensure that ID is unique and add appointment to list
	public boolean addAppointment(Appointment appointment) {
		for(Appointment a : appointments) {
			if(a.getAppointmentID().equals(appointment.getAppointmentID())) {
				System.out.println("Appointment already exists");
				return false;
			}
		}
		appointments.add(appointment);
		System.out.println("Appointment added successfully");
		return true;
	}
	
	//Delete an appointment from list
	public boolean deleteAppointment(String ID) {
		for(int i = 0; i < appointments.size(); i++) {
			if(appointments.get(i).getAppointmentID().equals(ID)) {
				appointments.remove(i);
				System.out.println("Appointment removed successfully");
				return true;
			}
			if(i == appointments.size() - 1) {
			System.out.println("Appointment \"" + ID + "\" not found");
			}
		}
		return false;
	}
}
