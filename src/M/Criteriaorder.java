package M;

public class Criteriaorder {
   public Criteriaorder(){
	   
   }
   private String ph_username;
   private String ph_gender;
   
public Criteriaorder(String username, String gender) {
	super();
	this.ph_username = username;
	this.ph_gender = gender;
}
public String getUsername() {
	return ph_username==null?"%%":"%"+ph_username+"%";
}
public void setUsername(String username) {
	this.ph_username = username;
}
public String getGender() {
	return ph_gender==null?"%%":"%"+ph_gender+"%";
}
public void setGender(String gender) {
	this.ph_gender = gender;
}
}
