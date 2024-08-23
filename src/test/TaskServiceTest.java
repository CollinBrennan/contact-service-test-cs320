package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.TaskService;

class TaskServiceTest {

	@Test
	void testAddTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("0", "Collin", "Test description");
		assertThrows(IllegalArgumentException.class,() -> {
			taskService.addTask("01234567890", "Collin", "Test description");
		});
	}
	
	@Test
	void testDeleteTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("0", "Collin", "Test description");
		taskService.deleteTask("0");
		taskService.deleteTask("1");
	}
	
	@Test
	void testUpdateTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("0", "Collin", "Test description");
		taskService.updateName("0", "Josh");
		assertThrows(IllegalArgumentException.class,() -> {
			taskService.updateName("0", "012345678901234567890");
		});
	}
}
