package contactservice;

import java.util.HashMap;
import java.util.Date;

public class AppointmentService {
	
	private HashMap<String, Appointment> appointments;
	
	public AppointmentService() {
		this.appointments = new HashMap<String, Appointment>();
	}
	
	public void addAppointment(String id, Date date, String description) {
		Appointment appointment = new Appointment(id, date, description);
		this.appointments.put(appointment.getId(), appointment);
	}
	
	public void deleteAppointment(String id) {
		this.appointments.remove(id);
	}
}
