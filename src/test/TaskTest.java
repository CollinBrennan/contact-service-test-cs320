package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.Task;

class TaskTest {

	@Test
	void testTask() {
		Task contact = new Task("id0", "Collin", "Test description");
		assertTrue(contact.getId().equals("id0"));
		assertTrue(contact.getName().equals("Collin"));
		assertTrue(contact.getDescription().equals("Test description"));
	}

	@Test
	void testIllegalArguments() {
		assertThrows(IllegalArgumentException.class,() -> {
			new Task("01234567890", "Collin", "Test description");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Task("012345", "012345678901234567890", "Test description");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Task("0123456789", "Collin", "012345678901234567890123456789012345678901234567890");
		});
	}
}
