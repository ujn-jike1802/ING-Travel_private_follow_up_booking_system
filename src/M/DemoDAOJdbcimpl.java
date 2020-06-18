package M;


import java.util.ArrayList;
import java.util.List;



public class DemoDAOJdbcimpl extends DAO<attractions> implements DemoDao{

	@Override
	public void demo(classDemo user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public attractions getById(int currPage) {
		// TODO Auto-generated method stub
		String sql="select attname attsrc_img attsrc_img1 attsrc_img2 attsrc_img3 glname1 glname2 glname3 atttype opentime lasting seasons attlevels from attractions where id=?";
		return get(sql,currPage);
	}
   
	
}
