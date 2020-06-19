package M;

public class criteriauser {

	private String username;
	private String password;
	private String gender;
	private String phonenumber;
	public String getUsername() {
		return username==null?"%%":"%"+username+"%";
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password==null?"%%":"%"+password+"%";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return  gender==null?"%%":"%"+gender+"%";
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber==null?"%%":"%"+phonenumber+"%";
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public criteriauser(String username, String password, String gender, String phonenumber) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}
	
		
}
