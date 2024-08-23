package contactservice;

import java.util.Date;

public class Appointment {
	
	private String id;
	private Date date;
	private String description;
	
	public Appointment(String id, Date date, String description) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid date");
		}
		
		if (id == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		this.id = id;
		this.date = date;
		this.description = description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date newDate) {
		if (newDate == null || newDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.date = newDate;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String newDescription) {
		if (id == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = newDescription;
	}
}