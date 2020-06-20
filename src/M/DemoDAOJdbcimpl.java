package M;


import java.util.ArrayList;
import java.util.List;



public class DemoDAOJdbcimpl extends DAO<attractions>  implements DemoDao{

	@Override
	public void demo(classDemo user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public attractions getById(int currPage) {
		// TODO Auto-generated method stub
		String sql="select * from attractions where id=?";
		return get(sql,currPage);
	}

	@Override
	public long getAttNumber() {
		// TODO Auto-generated method stub
		String sql="SELECT count(*) FROM attractions";
		return getForValue(sql);
	}

	@Override
	public attractions getByname(String name) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM attractions WHERE attname=?";
		return get(sql,name);
	}
   
	
}
