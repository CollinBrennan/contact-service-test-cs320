package contactservice;

import java.util.HashMap;

public class TaskService {
	private HashMap<String, Task> tasks;
	
	public TaskService() {
		this.tasks = new HashMap<String, Task>();
	}

	public void addTask(
		String id, 
		String name, 
		String description
	) {
		Task task = new Task(id, name, description);
		this.tasks.put(task.getId(), task);
	}

	public void deleteTask(String id) {
		this.tasks.remove(id);
	}
	
	public void updateName(String id, String name) {
		this.tasks.get(id).setName(name);
	}
	
	public void updateDescription(String id, String description) {
		this.tasks.get(id).setDescription(description);
	}
}
