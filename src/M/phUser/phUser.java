package M.phUser;

public class phUser {
	 private int id;
    private String username;
    private String password;
    private String gender;
    private String phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public phUser(int id, String username, String password, String gender, String phonenumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}
	public phUser() {
		
	}
	public phUser(String username, String password, String gender, String phonenumber) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}
    
}