package M;

public class order {
	public order() {
		
	}
	private int order_id;
	private int id;
	private String username;
	private String gender;
	private String phonenumber;
	private int ph_id;
	private String ph_username;
	private String ph_gender;
	private String ph_phonenumber;
	private String status;
	
	public order(int order_id, int id, String username, String gender, String phonenumber, int ph_id,
			String ph_username, String ph_gender, String ph_phonenumber, String status) {
		super();
		this.order_id = order_id;
		this.id = id;
		this.username = username;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.ph_id = ph_id;
		this.ph_username = ph_username;
		this.ph_gender = ph_gender;
		this.ph_phonenumber = ph_phonenumber;
		this.status = status;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
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
	public String getPh_gender() {
		return ph_gender;
	}
	public void setPh_gender(String ph_gender) {
		this.ph_gender = ph_gender;
	}
	public String getPh_phonenumber() {
		return ph_phonenumber;
	}
	public void setPh_phonenumber(String ph_phonenumber) {
		this.ph_phonenumber = ph_phonenumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
