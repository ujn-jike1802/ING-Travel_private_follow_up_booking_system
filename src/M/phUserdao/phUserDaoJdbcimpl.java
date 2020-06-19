package M.phUserdao;

import java.util.List;



import C.phUserCriteria.phCriteria;
import M.DAO;

import M.phUser.phUser;

public class phUserDaoJdbcimpl extends DAO<phUser> implements phUserDao{

	@Override
	public List<phUser> getAll() {
		String sql="select id,username,password,gender,phonenumber from photographer";
		return getForList(sql);
	}

	@Override
	public phUser get(Integer id) {
		String sql="select id,username,password,gender,phonenumber from photographer where id=?";
		return get(sql, id);
	}

	@Override
	public long getCountWithName(String name) {
		String sql="select count(*) from photographer where username=?";
		return getForValue(sql, name);
	}

	@Override
	public void delete(Integer id) {
		String sql="delete from photographer where id=?";
		update(sql, id);
		
	}

	@Override
	public void update(phUser user) {
		String sql="update photographer set username=?,password=?,gender=?,phonenumber=? where id=?";
		update(sql,user.getUsername(),user.getPassword(),user.getGender(),user.getPhonenumber(),user.getId());
		
	}

	@Override
	public void add(phUser user) {
		String sql="insert into photographer(username,password,gender,phonenumber) values(?,?,?,?)";
		update(sql,user.getUsername(),user.getPassword(),user.getGender(),user.getPhonenumber());
		
	}

	@Override
	public phUser login(String username, String password) {
		String sql="select username,password from photographer where username=? and password=?";
		return get(sql, username,password);
	}

	@Override
	public int Count(List<phUser> users) {
		int n=0;
		for(phUser user:users){
			n++;
		}
		return n;
	}

	@Override
	public List<phUser> selectUser(List<phUser> users, int currentPage, int pageSize) {
		 List<phUser> lis=users.subList((currentPage-1)*pageSize, currentPage*pageSize);
			return lis;
	}

	@Override
	public List<phUser> selectUser2(List<phUser> users, int currPage, int pageSize, int endSize) {
		List<phUser> lis=users.subList((currPage-1)*pageSize, (currPage-1)*pageSize+endSize);
		return lis;
	}

	@Override
	public List<phUser> getViewlist(String list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<phUser> CriteriaUser(phCriteria cc) {
	String sql="select  id,username,gender,phonenumber from photographer where username like ? and gender like ? and phonenumber like ?";
		
		return getForList(sql,cc.getUsername(),cc.getgender(),cc.getPhonenumber());
	
	}
	

}
