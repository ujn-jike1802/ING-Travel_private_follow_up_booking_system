package M;

public class CriteriaDemo {
	private String name;
	public CriteriaDemo(){
    	
    } 
	public CriteriaDemo(String name) {
		super();
		this.name = name;
	}	
	public String getUsername() {
		return name==null?"%%":"%"+name+"%";
	}
	
}