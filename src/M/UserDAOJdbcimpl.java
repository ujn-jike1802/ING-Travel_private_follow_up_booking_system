package M;

import java.util.List;

import M.criteriauser;

import M.DAO;
import M.UserDAO;

import M.User;

    public class UserDAOJdbcimpl extends DAO<User> implements UserDAO{
    	
    
    
    @Override
    public User getuser(int id) {
    		// TODO Auto-generated method stub
    		String sql="select id,username,password,gender,phonenumber from user where id=?";
    		return get(sql,id);
    }
	public User getuser(String username,String password) {
		String sql="select id,username,password,gender,phonenumber from user where username=? and password=?";
		return get(sql,username,password);
	}
	
	@Override
	public List<User> getalluser() {
		// TODO Auto-generated method stub
		String sql="select id,username,password,gender,phonenumber from user";
		return getForList(sql);
	}
	
	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		String sql="update user set username=?,password=?,gender=?,phonenumber=? where id=?";
		update(sql,user.getUsername(),user.getPassword(),user.getGender(),user.getPhonenumber(),user.getId());
	}
	
	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		String sql="delete from user where id=?";
		update(sql,id);
	}
	
	@Override
	public void adduser(User user) {
		// TODO Auto-generated method stub
		String sql="insert into user(username,password,gender,phonenumber) values(?,?,?,?)" ;
		update(sql,user.getUsername(),user.getPassword(),user.getGender(),user.getPhonenumber());
	}
	
	public long getPageCount1(criteriauser cc)
	{
		 String sql="select count(*) from user where username like ? and password like ? and gender like ? and phonenumber like ?";
		 return  getForValue(sql,cc.getUsername(),cc.getPassword(),cc.getGender(),cc.getPhonenumber());
	}
	
	@Override
	public List<User> getcriteriauser(criteriauser cc,int currPage,int pageSize) {
		// TODO Auto-generated method stub
	  String sql="select id,username,password,gender,phonenumber from user where username like ? and password like ? and gender like ? and phonenumber like ? limit ?,?";
	 return getForList(sql,cc.getUsername(),cc.getPassword(),cc.getGender(),cc.getPhonenumber(),(currPage-1)*pageSize,pageSize);
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
	
<<<<<<< HEAD

=======
>>>>>>> 922b8156daab0dc407d6e046001e19f2a2ed3dec
}
