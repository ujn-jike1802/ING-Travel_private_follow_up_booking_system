package M;

public class CriteriaPhotographer {
	private String ph_username;
	public CriteriaPhotographer(){
    	
    } 
	public CriteriaPhotographer(String  ph_username) {
		super();
		this. ph_username =  ph_username;
	}	
	public String getUsername() {
		return  ph_username==null?"%%":"%"+ ph_username+"%";
	}
	
}