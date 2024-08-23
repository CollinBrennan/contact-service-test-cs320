package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("0", "Collin", "Brennan", "0123456789", "1 Main Street");
		assertThrows(IllegalArgumentException.class,() -> {
			contactService.addContact("01234567890", "Collin", "Brennan", "0123456789", "123 Maple Street");
		});
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("0", "Collin", "Brennan", "0123456789", "1 Main Street");
		contactService.deleteContact("0");
		contactService.deleteContact("1");
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("0", "Collin", "Brennan", "0123456789", "1 Main Street");
		contactService.updateFirstName("0", "Josh");
		assertThrows(IllegalArgumentException.class,() -> {
			contactService.updateFirstName("0", "01234567890");
		});
	}
}
