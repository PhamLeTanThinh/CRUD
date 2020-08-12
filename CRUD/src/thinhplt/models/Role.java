package thinhplt.models;

public class Role {
	//Properties
	int id;
	private String name;
	private String description;
	
	//Constructor
	public Role(String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Role() {
		super();
	}
	
	//Getter and Setter
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
