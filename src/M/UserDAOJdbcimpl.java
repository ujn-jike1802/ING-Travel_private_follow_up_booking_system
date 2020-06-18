package M;

import M.DAO;
import M.UserDAO;

import M.User;

    public class UserDAOJdbcimpl extends DAO<User> implements UserDAO{
    	
    	
	public User get(String username,String password) {
		String sql="select id,username,password,gender,phonenumber from user where username=? and password=?";
		return get(sql,username,password);
	}
	@Override
	public long getCountWithName(String name) {
		String sql="select count(*) from user where username=?";
		return getForValue(sql, name);
	}
	
	@Override
	public void add(User user) {
		String sql="insert into user(username,password,gender,phonenumber) values(?,?,?,?)";
		update(sql,user.getUsername(),user.getPassword(),user.getGender(),user.getPhonenumber());
		
	}
}
