/* Matt Tranchina
 * CS 320 Software Test, Automation QA
 * SNHU Professor Wilson
 *   Mobile Application Project
 *     Task Service 
 *
 * The purpose of Task Service is to add a already created task to a list.
 * Once verified that task ID is unique and added to the list, a task name 
 * and description can be updated. A task can also be deleted.
 */

package Project;
import java.util.*;

public class TaskService {
	
	//Create list of tasks
	private ArrayList<Task>tasks = new ArrayList<Task>();
	
	public TaskService() {
		tasks = new ArrayList<>();
	}
	
	//Ensure that task ID is unique and add to list
	public boolean addTask(Task task) {
		for(Task t : tasks) {
			if(t.getTaskID().equals(task.getTaskID())) {
				System.out.println("Task ID already exists");
				return false;
			}
		}
		tasks.add(task);
		System.out.println("Task ID added successfully");
		return true;
	}
	
	//Delete Task from list
	public boolean deleteTask(String taskID) {
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getTaskID().equals(taskID)) {
				tasks.remove(i);
				System.out.println("Task deleted successfully");
				return true;
			}
			if(i == tasks.size() - 1) {
				System.out.println("Contact ID: \"" + taskID + "\" not found.");
			}
		}
		return false;
	}
	
	//Update Task Name
	public boolean updateTaskName(String name, String ID) {
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getTaskID().equals(ID)) {
				tasks.get(i).setTaskName(name);
				System.out.println("Task name updated to \"" + name + "\".");
				return true;
			}
			if(i == tasks.size() - 1) {
				System.out.println("Task ID: \"" + ID + "\" not found.");
			}
		}
		return false;
	}
	
	//Update Description
	public boolean updateDescription(String descript, String ID) {
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getTaskID().equals(ID)) {
				tasks.get(i).setTaskDescription(descript);
				System.out.println("Task description updated.");
				return true;
			}
			if(i == tasks.size() - 1) {
				System.out.println("Task ID: \"" + ID + "\" not found.");
			}
		}
		return false;
	}

}
