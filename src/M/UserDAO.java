package M;



public interface UserDAO {
	public User get(String username,String password);
	
	public long getCountWithName(String name);
	
	public void add(User user);
	
	
}
