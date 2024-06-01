/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Appointment Service Test 
 *
 * Test procedures to ensure that a new appointment can be created and
 * added to a list. Once appointment is added, test to ensure that an 
 * appointment can be deleted from list. 
 */

package ProjectTests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Project.Appointment;
import Project.AppointmentService;

class AppointmentServiceTest {
	
	//Establish test Date
	LocalDate dentistAppointment = LocalDate.of(2025, 3, 24);

	//Test adding new appointment
	@Test
	public void testAddAppointment() {
		AppointmentService AP = new AppointmentService();
		Appointment newAppointment = new Appointment("Dentist", dentistAppointment, "Getting tooth extracted");
		assertEquals(true, AP.addAppointment(newAppointment));
		//Test duplicate appointment ID
		Appointment newAppointment2 = new Appointment("Dentist", dentistAppointment, "Just a filling");
		assertEquals(false, AP.addAppointment(newAppointment2));
	}
	
	//Test delete appointment
	@Test
	public void testDeleteAppointment() {
		AppointmentService AP = new AppointmentService();
		Appointment newAppointment = new Appointment("Dentist", dentistAppointment, "Getting tooth extracted");
		AP.addAppointment(newAppointment);
		assertEquals(true, AP.deleteAppointment("Dentist"));
		assertEquals(false, AP.deleteAppointment("Hair Cut"));
	}
}

