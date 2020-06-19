package M;

import java.util.List;

import M.User;

public interface UserDAO {
	public User getuser(String username,String password);
	
	public List<User> getalluser();	
	
	public User getuser(int id);
	
	public void updateuser(User user);
	
	public void deleteuser(int id);
	
	public void adduser(User user);
	
	public long getPageCount1(criteriauser cc);
	
	public List<User> getcriteriauser(criteriauser cc,int currPage,int pageSize);
	
	public long getCountWithName(String name);
	
	public void add(User user);
}
