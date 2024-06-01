/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Contact Service 
 * 
 * The purpose of Contact Service is to create an array list to hold user information such as 
 * a unique contact ID, first and last name, phone number and address. Once a unique ID is chosen,
 * user can update first and last name, phone number or address if necessary. User can also delete
 * contact information if needed. 
 */

package Project;

import java.util.*;

public class ContactService {
		
	//Create a list of contacts
	private ArrayList<Contact>contacts = new ArrayList<Contact>();
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Ensure that ID is unique and add Contact to list
	public boolean addContact(Contact contact) {
		for(Contact c : contacts) {
			if(c.getContactID().equals(contact.getContactID())) {
				System.out.println("Contact already exists");
				return false;
			}
		}
		contacts.add(contact);
		System.out.println("Contact added successfully");
		return true;
	}
	
	//Delete Contact from list
	public boolean deleteContact(String contactID) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getContactID().equals(contactID)) {
				contacts.remove(i);
				System.out.println("Contact deleted successfully");
				return true;
			}
			if(i == contacts.size() - 1) {
				System.out.println("Contact ID: \"" + contactID + "\" not found.");
			}
		}
		return false;
	}
	
	//Update First Name
	public boolean updateFirstName(String first, String contactID) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setFirstName(first);
				System.out.println("First name updated to \"" + first + "\".");
				return true;
			}
			if(i == contacts.size() - 1) {
				System.out.println("Contact ID: \"" + contactID + "\" not found.");
			}
		}
		return false;
	}
	
	
	//Update Last Name
	public boolean updateLastName(String last, String contactID) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setLastName(last);
				System.out.println("Last name updated to \"" + last + "\".");
				return true;
			}
			if(i == contacts.size() - 1) {
				System.out.println("Contact ID: \"" + contactID + "\" not found.");
			}
		}
		return false;
	}
	
	
	//Update Phone Number
	public boolean updatePhoneNumber(String number, String contactID) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setPhoneNumber(number);
				System.out.println("Phone Number updated to \"" + number + "\".");
				return true;
			}
			if(i == contacts.size() - 1) {
				System.out.println("Contact ID: \"" + contactID + "\" not found.");
			}
		}
		return false;
	}
	
	
	//Update Address
	public boolean updateAddress(String add, String contactID) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getContactID().equals(contactID)) {
				contacts.get(i).setAddress(add);
				System.out.println("Address updated to \"" + add + "\".");
				return true;
			}
			if(i == contacts.size() - 1) {
				System.out.println("Contact ID: \"" + contactID + "\" not found.");
			}
		}
		return false;
	}
	
	
}
