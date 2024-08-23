package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import contactservice.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testAddAppointment() {
		Calendar validCalendar = Calendar.getInstance();
		validCalendar.set(validCalendar.get(Calendar.YEAR) + 1, 1, 1);
		Date validDate = validCalendar.getTime(); // Valid date a year from now
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment("0", validDate, "Test description");
		
		assertThrows(IllegalArgumentException.class,() -> {
			Calendar calendar = Calendar.getInstance();
			calendar.set(2010, 1, 1);
			Date date = calendar.getTime(); // Invalid date with which appointment should throw an error
			
			appointmentService.addAppointment("01234567890", date, "Test description");
		});
	}
	
	@Test
	void testDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		appointmentService.addAppointment("0", new Date(), "Test description");
		appointmentService.deleteAppointment("0");
		appointmentService.deleteAppointment("1");
	}
}
