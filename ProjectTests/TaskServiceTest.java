/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Task Service Test
 *     
 * Test procedures to ensure that a new task will be added successfully
 * and another task can not be added with the same ID. Deletion of a task.
 * Update an existing task name and description.
 */

package ProjectTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Project.Task;
import Project.TaskService;

class TaskServiceTest {

	//Test adding new Task
	@Test
	public void testAddTask() {
		TaskService TS = new TaskService();
		Task newTask = new Task("5150", "Psycho", "Lost his marbles");
		assertEquals(true, TS.addTask(newTask));
		//Test Task Uniqueness
		Task newTask2 = new Task("5150", "Lunatic", "All sixes and sevens");
		assertEquals(false, TS.addTask(newTask2));
	}
	
	//Test deletion of task
	@Test
	public void testDeleteTask() {
		TaskService TS = new TaskService();
		Task newTask = new Task("5150", "Psycho", "Lost his marbles");
		TS.addTask(newTask);
		assertEquals(true, TS.deleteTask("5150"));
		assertEquals(false, TS.deleteTask("1000"));
	}
	
	//Test update Task
	@Test
	public void testUpdateTaskName() {
		TaskService TS = new TaskService();
		Task newTask = new Task("5150", "Psycho", "Lost his marbles");
		TS.addTask(newTask);
		
		//Update Task Name
		assertEquals(true, TS.updateTaskName("Lunatic", "5150"));
		assertEquals(false, TS.updateTaskName("Lunatic", "1000"));
		
		//Update Task description
		assertEquals(true, TS.updateDescription("All sixes and sevens", "5150"));
		assertEquals(false, TS.updateDescription("All sixes and sevens", "1000"));
	}
	
}


