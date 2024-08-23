package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.Appointment;

import java.util.Calendar;
import java.util.Date;

class AppointmentTest {

	@Test
	void testTask() {
		Date currentDate = new Date();
		Appointment appointment = new Appointment("id0", currentDate, "Test description");
		assertTrue(appointment.getId().equals("id0"));
		assertTrue(appointment.getDate().equals(currentDate));
		assertTrue(appointment.getDescription().equals("Test description"));
	}

	@Test
	void testIllegalArguments() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 1, 1);
		Date date = calendar.getTime(); // Invalid date with which appointment should throw an error
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Appointment("01234567890", new Date(), "Test description");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Appointment("012345", date, "Test description");
		});
		
		assertThrows(IllegalArgumentException.class,() -> {
			new Appointment("0123456789", new Date(), "012345678901234567890123456789012345678901234567890");
		});
	}
}
