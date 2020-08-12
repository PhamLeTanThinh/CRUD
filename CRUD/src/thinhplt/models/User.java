package thinhplt.models;

public class User {
	//1. Properties
	private int id;
	private String hoten;
	private String email;
	private String sdt;
	
	//2. Constructor
	public User(int id, String hoten, String email, String sdt) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.email = email;
		this.sdt = sdt;
	}
	public User() {
		super();
	}
	
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
}
