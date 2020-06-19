package C.phUserCriteria;

public class phCriteria {
	private String username;
	private String gender;
	private String phonenumber;
	

	public phCriteria(String username, String gender) {
		super();
		this.username = username;
		this.gender = gender;
	}
	
	public phCriteria(String username, String gender, String phonenumber) {
		super();
		this.username = username;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}

	public String getUsername() {
		return username==null?"%%":"%"+username+"%";
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getgender() {
		return gender==null?"%%":"%"+gender+"%";
	}
	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		
		return phonenumber==null?"%%":"%"+phonenumber+"%";
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
