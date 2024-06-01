/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Task Test
 *     
 * Test procedures to ensure that a task will be created within the 
 * confines of the requirements.  
 */

package ProjectTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Project.Task;

class TaskTest {

	Task task = new Task("5150", "Psycho", "Lost his marbles");
	
	//Test creation of task
	@Test
	void testTask() {
		assertTrue(task != null);
		assertTrue(task.getTaskID().equals("5150"));
		assertTrue(task.getTaskName().equals("Psycho"));
		assertTrue(task.getTaskDescription().equals("Lost his marbles"));
	}
	
	//Test that Task ID is over 10 characters
	@Test
	void testTaskIDLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567891011112", "Psycho", "Lost his marbles");
		});	
	}
	
	//Test that Task ID is NULL
	@Test
	void testTaskNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Psycho", "Lost his marbles");
		});
	}
	
	//Test that Task Name is over 20 characters
	@Test
	void testTaskNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("5150", "This name is well over the 20 character cap", "Lost his marbles");
		});
	}
	
	
	//Test that Task Name is NULL
	@Test
	void testTaskNameNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("5150", null, "Lost his marbles");
		});
	}
		
	//Test that Task Description is over 50 characters
	@Test
	void testTaskDescriptionLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("5150", "Psycho", "Never going to give you up, never going to let you down. Never going to run around, and hurt you");
		});
	}
		
	//Test that Task Description is NULL
	@Test
	void testTaskDescriptionNULL() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("5150", "Psycho", null);
		});
	}
}
