/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Contact 
 *
 * The purpose of Contact is to confirm and set contact information. Contact ID, first name, and last
 * name must be at least one character in length and a max of ten characters. Phone numbers must be
 * exactly ten characters and addresses must be at least one character and a max of thirty.
 * Once confirmed, contact is added to list.
 */

package Project;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	//Constructor
	public Contact (String ID, String first, String last, String number, String add) {
		
		 // Validate user inputs correct amount of characters
		 
		 //Contact ID is not empty and less than 10 characters
		 if(ID == null || ID.length() > 10) {
			 throw new IllegalArgumentException("Invalid Contact ID. Must be at least one (1) character and less than ten (10) characters");			 
		 }
		 this.contactID = ID;
		
		 
		 //First name is not empty and less than 10 characters
		 if(first == null || first.length() > 10) {
			 throw new IllegalArgumentException("Invalid First Name. Must be at least one (1) character and less than ten (10) characters");
		 }
		 this.firstName = first;
		 
		 
		 //Last name is not empty and less than 10 characters
		 if(last == null || last.length() > 10) {
			 throw new IllegalArgumentException("Invalid Last Name. Must be at least one (1) character and less than ten (10) characters");
		 }
		 this.lastName = last;
		 
		 
		 //Phone number is not empty and exactly 10 characters
		 if(number == null || number.length() != 10) {
			 throw new IllegalArgumentException("Invalid Phone Number. Must be 10 numbers long (ex:5558675309)");
		 }
	     this.phoneNumber = number;
		
		 
		 //Address is not empty and less than 30 characters
		 if(add == null || add.length() > 30) {
			 throw new IllegalArgumentException("Invalid Address. Must be at least one (1) character and less than thirty (30) characters");
		 }
		 this.address = add;
		 
	}
	
	// Setters
	
	public void setContactID(String ID) {
		this.contactID = ID;
	}
	
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	public void setLastName(String last) {
		this.lastName = last;
	}
	
	public void setPhoneNumber(String number) {
		this.phoneNumber = number;
	}
	
	public void setAddress(String add) {
		this.address = add;
	}
	
	// Getters
	
	public String getContactID(){
		return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
}
