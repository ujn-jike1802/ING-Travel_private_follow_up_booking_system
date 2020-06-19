package C.phUserCriteria;

public class attCriteria {
   private String attname;
   private String atttype;
   private String attlevels;
public attCriteria(String attname, String atttype, String attlevels) {
	super();
	this.attname = attname;
	this.atttype = atttype;
	this.attlevels = attlevels;
}
public String getAttname() {
	return attname==null?"%%":"%"+attname+"%";
}
public void setAttname(String attname) {
	this.attname =attname;
}
public String getAtttype() {
	return atttype==null?"%%":"%"+atttype+"%";
}
public void setAtttype(String atttype) {
	this.atttype = atttype;
}
public String getAttlevels() {
	return attlevels==null?"%%":"%"+attlevels+"%";
}
public void setAttlevels(String attlevels) {
	this.attlevels = attlevels;
}
   
}
