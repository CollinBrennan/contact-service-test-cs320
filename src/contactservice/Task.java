package contactservice;

public class Task {
	private String id;
	private String name;
	private String description;
	
	public Task(String id, String name, String description) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		if (newName == null || newName.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.name = newName;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String newDescription) {
		if (newDescription == null || newDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = newDescription;
	}
}
