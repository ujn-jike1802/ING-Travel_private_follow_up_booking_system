package M;

public class pieces {
  public pieces(){
	  
  }
  private int piece_id;
  private String photo_src;
  private String photo_time;
  private String photo_place;
  private String photo_theme;
  public pieces(int id, String photo_src, String photo_time, String photo_place, String photo_theme) {
	super();
	this.piece_id = id;
	this.photo_src = photo_src;
	this.photo_time = photo_time;
	this.photo_place = photo_place;
	this.photo_theme = photo_theme;
}
public int getId() {
	return piece_id;
}
public void setId(int piece_id) {
	this.piece_id = piece_id;
}
public String getPhoto_src() {
	return photo_src;
}
public void setPhoto_src(String photo_src) {
	this.photo_src = photo_src;
}
public String getPhoto_time() {
	return photo_time;
}
public void setPhoto_time(String photo_time) {
	this.photo_time = photo_time;
}
public String getPhoto_place() {
	return photo_place;
}
public void setPhoto_place(String photo_place) {
	this.photo_place = photo_place;
}
public String getPhoto_theme() {
	return photo_theme;
}
public void setPhoto_theme(String photo_theme) {
	this.photo_theme = photo_theme;
}


}
