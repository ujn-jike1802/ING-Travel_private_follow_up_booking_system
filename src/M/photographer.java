package M;

public class photographer {
	public photographer(){
		
	}
	private int ph_id;
	private String	ph_username;
	private String	ph_password;
	private String	ph_gender;
	private String	ph_phonenumebr;
	public int getPh_id() {
		return ph_id;
	}
	public void setPh_id(int ph_id) {
		this.ph_id = ph_id;
	}
	public String getPh_username() {
		return ph_username;
	}
	public void setPh_username(String ph_username) {
		this.ph_username = ph_username;
	}
	public String getPh_password() {
		return ph_password;
	}
	public void setPh_password(String ph_password) {
		this.ph_password = ph_password;
	}
	public String getPh_gender() {
		return ph_gender;
	}
	public void setPh_gender(String ph_gender) {
		this.ph_gender = ph_gender;
	}
	public String getPh_phonenumebr() {
		return ph_phonenumebr;
	}
	public void setPh_phonenumebr(String ph_phonenumebr) {
		this.ph_phonenumebr = ph_phonenumebr;
	}
	public photographer(int ph_id, String ph_username, String ph_password, String ph_gender, String ph_phonenumebr) {
		super();
		this.ph_id = ph_id;
		this.ph_username = ph_username;
		this.ph_password = ph_password;
		this.ph_gender = ph_gender;
		this.ph_phonenumebr = ph_phonenumebr;
	}
	
}
