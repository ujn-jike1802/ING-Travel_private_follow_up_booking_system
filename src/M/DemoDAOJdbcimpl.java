package M;


import java.util.ArrayList;
import java.util.List;



public class DemoDAOJdbcimpl extends DAO<User> implements UserDAO{

	public User get(String username,String password) {
		String sql="select id,username,password,gender,phonenumber from test where username=? and password=?";
		return get(sql,username,password);
	}
	@Override
	public long getCountWithName(String name) {
		String sql="select count(*) from test where username=?";
		return getForValue(sql, name);
	}
	
	@Override
	public void add(User user) {
		String sql="insert into test(username,password,gender,phonenumber) values(?,?,?,?)";
		update(sql,user.getUsername(),user.getPassword(),user.getGender(),user.getPhonenumber());
		
	}

}
