package contactservice;

import java.util.HashMap;

public class ContactService {
	private HashMap<String, Contact> contacts;
	
	public ContactService() {
		this.contacts = new HashMap<String, Contact>();
	}

	public void addContact(
		String id, 
		String firstName, 
		String lastName, 
		String phone, 
		String address
	) {
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		this.contacts.put(contact.getId(), contact);
	}

	public void deleteContact(String id) {
		this.contacts.remove(id);
	}
	
	public void updateFirstName(String id, String firstName) {
		this.contacts.get(id).setFirstName(firstName);
	}
	
	public void updateLastName(String id, String lastName) {
		this.contacts.get(id).setLastName(lastName);
	}
	
	public void updatePhone(String id, String phone) {
		this.contacts.get(id).setPhone(phone);
	}
	
	public void updateAddress(String id, String address) {
		this.contacts.get(id).setFirstName(address);
	}
}
