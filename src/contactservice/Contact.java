package contactservice;

public class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(
		String id, 
		String firstName, 
		String lastName, 
		String phone, 
		String address
	) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String newFirstName) {
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = newFirstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String newLastName) {
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = newLastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String newPhone) {
		if (newPhone == null || newPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		this.phone = newPhone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = newAddress;
	}
	
}
