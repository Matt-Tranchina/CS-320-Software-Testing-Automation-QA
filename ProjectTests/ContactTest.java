/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Contact Test
 *     
 * Test procedures to ensure that a contact will be created within the 
 * confines of the requirements.  
 */

package ProjectTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Project.Contact;

class ContactTest {
	
	//Test creation of contact
	@Test
	void testContactCreation() {
		Contact contacts = new Contact("RatKing", "Charlie", "Kelly", "5558675309", "Paddys Pub");
		assertTrue(contacts != null);
		assertTrue(contacts.getContactID().equals("RatKing"));
		assertTrue(contacts.getFirstName().equals("Charlie"));
		assertTrue(contacts.getLastName().equals("Kelly"));
		assertTrue(contacts.getPhoneNumber().equals("5558675309"));
		assertTrue(contacts.getAddress().equals("Paddys Pub"));
		
	}
	
	//Test that contact ID is over 10 characters
	@Test
	void testContactIDLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("Charlie the Rat King", "Charlie", "Kelly", "5558675309", "Paddys Pub");
		    });	
	}
	
	//Test that contact ID is null
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact(null , "Charlie", "Kelly", "5558675309", "Paddys Pub");
		    });	
	}
	
	//Test that first name is over 10 characters
	@Test
	void testContactFirstNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("RatKing", "Day Man fighter of the Night Man", "Kelly", "5558675309", "Paddys Pub");
		});
	}
	
	//Test first name is null
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", null, "Kelly", "5558675309", "Paddys Pub");
		    });	
	}
	
	//Test last name is over 10 characters
	@Test
	void testContactLastNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", "Milk steak with a side of raw jelly beans", "5558675309", "Paddys Pub");
		    });	
	}
	
	//Test last name is null
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", null, "5558675309", "Paddys Pub");
		    });	
	}
	
	//Test phone number is less than 10 characters
	@Test
	void testContactPhoneNumberLess() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", "Kelly", "555", "Paddys Pub");
		    });	
	}
	
	//Test phone number is over 10 characters
	@Test
	void testContactPhoneNumberLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", "Kelly", "1234567891011121314151617181920", "Paddys Pub");
		    });	
	}
	
	//Test phone number is null
	@Test
	void testContactPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", "Kelly", null, "Paddys Pub");
		    });	
	}
	
	//Test address is over 30 characters
	@Test
	void testContactAddressLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", "Kelly", "5558675309", "Holy crap this is the longest address on the planet");
		    });	
	}
	
	//Test address is null
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			  new Contact("RatKing", "Charlie", "Kelly", "5558675309", null);
		    });	
	}

}
