/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Task
 *
 * The purpose of the Task file is to create a task to be later added to a list.
 * Each task will have a unique ID, task name, and a description of the task.
 * 
 */

package Project;

public class Task {
	
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	//Constructor
	public Task (String ID, String name, String descript) {
		
		//Validate inputs meet requirements
		
		//ID shall not be NULL or longer than 10 characters
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID, must be at least one (1) character and less than ten (10) characters");
		}
		this.taskID = ID;
		
		//Name shall not be NULL or longer than 20 characters
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name, must be at least one (1) characters and less than twenty (20) characters");
		}
		this.taskName = name;
		
		//Description shall not be NULL or longer than 50 characters
		if(descript == null || descript.length() > 50) {
			throw new IllegalArgumentException("Invalid Description, must be at least one (1) character and less than fifty (50) characters");
		}
		this.taskDescription = descript;
	}
	
	//Setters
	
	public void setTaskID(String ID) {
		this.taskID = ID;
	}
	
	public void setTaskName(String name) {
		this.taskName = name;
	}
	
	public void setTaskDescription(String descript) {
		this.taskDescription = descript;
	}
	
	//Getters
	
	public String getTaskID() {
		return this.taskID;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public String getTaskDescription() {
		return this.taskDescription;
	}

}
