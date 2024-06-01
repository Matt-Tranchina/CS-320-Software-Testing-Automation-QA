/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Contact Service Test
 *     
 * Test procedures to ensure that a new contact will be added successfully
 * and another contact can not be added with the same ID. Deletion of a contact.
 * Update an existing contacts first name, last name, phone number and address.
 * Additional tests to ensure updating an existing contact.
 */

package ProjectTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Project.Contact;
import Project.ContactService;


class ContactServiceTest {
	
	//Test add new contact
	@Test
	public void testAdd() {
		ContactService CS = new ContactService();
		Contact newContact = new Contact("RatKing", "Charlie", "Kelly", "5558675309", "Paddys Pub");
		assertEquals(true, CS.addContact(newContact));
		//Test duplicate contacts
		Contact newContact2 = new Contact("RatKing", "Frank", "Reynolds", "5551234567", "Charlies Apartment");
		assertEquals(false, CS.addContact(newContact2));
	}
	
	//Test delete contact
	@Test
	public void testDelete() {
		ContactService CS = new ContactService();
		Contact newContact = new Contact("RatKing", "Charlie", "Kelly", "5558675309", "Paddys Pub");
		CS.addContact(newContact);
		assertEquals(true, CS.deleteContact("RatKing"));
		assertEquals(false, CS.deleteContact("TheTrashMan"));
		
	}
	
	//Test update contact
	@Test
	public void testUpdate() {
		ContactService CS = new ContactService();
		Contact newContact = new Contact("RatKing", "Charlie", "Kelly", "5558675309", "Paddys Pub");
		CS.addContact(newContact);
		
		//Update first name
		assertEquals(true, CS.updateFirstName("Frank", "RatKing"));
		assertEquals(false, CS.updateFirstName("Frank", "TheTrashMan"));
		
		//Update last name
		assertEquals(true, CS.updateLastName("Reynolds", "RatKing"));
		assertEquals(false, CS.updateLastName("Reynolds", "TheTrashMan"));
		
		//Update phone number
		assertEquals(true, CS.updatePhoneNumber("5551234567", "RatKing"));
		assertEquals(false, CS.updatePhoneNumber("5551234567", "TheTrashMan"));
		
		//Update address
		assertEquals(true, CS.updateAddress("544 Mateo St. Los Angeles, CA", "RatKing"));
		assertEquals(false, CS.updateAddress("544 Mateo St. Los Angeles, CA", "TheTrashMan"));
	}
}
