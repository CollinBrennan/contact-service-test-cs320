package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("id0", "Collin", "Brennan", "0123456789", "123 Maple Street");
		assertTrue(contact.getId().equals("id0"));
		assertTrue(contact.getFirstName().equals("Collin"));
		assertTrue(contact.getLastName().equals("Brennan"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("123 Maple Street"));
	}

	@Test
	void testIllegalArguments() {
		assertThrows(IllegalArgumentException.class,() -> {
			new Contact("01234567890", "Collin", "Brennan", "0123456789", "123 Maple Street");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Contact("012345", "Collin012345678", "Brennan", "0123456789", "123 Maple Street");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Contact("01234567890", "Collin", "Brennan012312313", "0123456789", "123 Maple Street");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Contact("012345", "Collin", "Brennan", "0123456", "123 Maple Street");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Contact("012345", "Collin", "Brennan", "0123456789", "123 Maple Street, New York, New York");
		});
	}
}
