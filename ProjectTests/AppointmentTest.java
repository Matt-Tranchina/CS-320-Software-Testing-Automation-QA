/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Appointment Test 
 *
 * Test procedures to ensure that an appointments ID is not too long nor NULL,
 * date is not in the past nor NULL, and description is not too long nor NULL.
 * 
 */

package ProjectTests;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Project.Appointment;

class AppointmentTest {
	//Establish current date
	LocalDate today = LocalDate.now();
	
	//Establish test appointment date
	LocalDate dentistAppointment = LocalDate.of(2025, 3, 24);
	
	//Establish test past date
	LocalDate thePast = LocalDate.of(1990, 3, 24);
	
	//Test Create new appointment
	@Test
	void testAppointmentCreation() {
		Appointment newAppointment = new Appointment("Dentist", dentistAppointment, "Getting tooth extracted");
		assertTrue(newAppointment != null);
		assertTrue(newAppointment.getAppointmentID().equals("Dentist"));
		assertTrue(newAppointment.getAppointmentDate().equals(dentistAppointment));
		assertTrue(newAppointment.getAppointmentDescription().equals("Getting tooth extracted"));
	}
	
	//Test Appointment ID is too long
	@Test
	void testAppointmentIDLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Is the tooth fairy a rouge dentist?", dentistAppointment, "Getting tooth extracted");
		});
	}
	
	//Test Appointment ID is NULL
	@Test
	void testAppointmentIDNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, dentistAppointment, "Getting tooth extracted");
		});
	}
	
	//Test Appointment date for future date
	@Test
	void testAppointmentDateOld() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Dentist", thePast, "Getting tooth extracted");
		});
	}
	
	//Test Appointment date is NULL
	@Test
	void testAppointmentDateNULL(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Dentist", null, "Getting tooth extracted");
		});
	}
	
	//Test Appointment description is too long
	@Test
	void testAppointmentDescriptionLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Dentist", dentistAppointment, "They might pull a tooth but they might not, either way it'll cost an arm and a leg");
		});
	}
	
	//Test Appointment description is NULL
	@Test
	void testAppointmentDescriptionNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("Dentist", dentistAppointment, null);
		});
	}
}
