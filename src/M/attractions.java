package M;

public class attractions {
	public attractions(){
		
	}
	
	private int id;
	private String attname;
	private String attsrc_img;
	private String attsrc_img1;
	private String attsrc_img2;
	private String attsrc_img3;
	private String glname1;
	private String glname2;
	private String glname3;
	private String atttype;
	private String opentime;
	private String lasting;
	private String seasons;
	private String attlevels;
	private String attvideo;
	public attractions(int id, String attname, String attsrc_img, String attsrc_img1, String attsrc_img2,
			String attsrc_img3, String glname1, String glname2, String glname3, String atttype, String opentime,
			String lasting, String seasons, String attlevels, String attvideo, String attvioog) {
		super();
		this.id = id;
		this.attname = attname;
		this.attsrc_img = attsrc_img;
		this.attsrc_img1 = attsrc_img1;
		this.attsrc_img2 = attsrc_img2;
		this.attsrc_img3 = attsrc_img3;
		this.glname1 = glname1;
		this.glname2 = glname2;
		this.glname3 = glname3;
		this.atttype = atttype;
		this.opentime = opentime;
		this.lasting = lasting;
		this.seasons = seasons;
		this.attlevels = attlevels;
		this.attvideo = attvideo;
		this.attvioog = attvioog;
	}
	public String getAttvideo() {
		return attvideo;
	}
	public void setAttvideo(String attvideo) {
		this.attvideo = attvideo;
	}
	public String getAttvioog() {
		return attvioog;
	}
	public void setAttvioog(String attvioog) {
		this.attvioog = attvioog;
	}
	private String attvioog;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAttname() {
		return attname;
	}
	public void setAttname(String attname) {
		this.attname = attname;
	}
	public String getAttsrc_img() {
		return attsrc_img;
	}
	public void setAttsrc_img(String attsrc_img) {
		this.attsrc_img = attsrc_img;
	}
	public String getAttsrc_img1() {
		return attsrc_img1;
	}
	public void setAttsrc_img1(String attsrc_img1) {
		this.attsrc_img1 = attsrc_img1;
	}
	public String getAttsrc_img2() {
		return attsrc_img2;
	}
	public void setAttsrc_img2(String attsrc_img2) {
		this.attsrc_img2 = attsrc_img2;
	}
	public String getAttsrc_img3() {
		return attsrc_img3;
	}
	public void setAttsrc_img3(String attsrc_img3) {
		this.attsrc_img3 = attsrc_img3;
	}
	public String getGlname1() {
		return glname1;
	}
	public void setGlname1(String glname1) {
		this.glname1 = glname1;
	}
	public String getGlname2() {
		return glname2;
	}
	public void setGlname2(String glname2) {
		this.glname2 = glname2;
	}
	public String getGlname3() {
		return glname3;
	}
	public void setGlname3(String glname3) {
		this.glname3 = glname3;
	}
	public String getAtttype() {
		return atttype;
	}
	public void setAtttype(String atttype) {
		this.atttype = atttype;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getLasting() {
		return lasting;
	}
	public void setLasting(String lasting) {
		this.lasting = lasting;
	}
	public String getSeasons() {
		return seasons;
	}
	public void setSeasons(String seasons) {
		this.seasons = seasons;
	}
	public String getAttlevels() {
		return attlevels;
	}
	public void setAttlevels(String attlevels) {
		this.attlevels = attlevels;
	}

}
