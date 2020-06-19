package M;

public class criteriaorder {
	String username;
	String ph_username;
	String status;
	public String getUsername() {
		return username==null?"%%":"%"+username+"%";
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPh_username() {
		return ph_username==null?"%%":"%"+ph_username+"%";
	}
	public void setPh_username(String ph_username) {
		this.ph_username = ph_username;
	}

	public String getStatus() {
		return status==null?"%%":"%"+status+"%";
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public criteriaorder(String username, String ph_username, String status) {
		super();
		this.username = username;
		this.ph_username = ph_username;
		this.status = status;
	}
	
}
