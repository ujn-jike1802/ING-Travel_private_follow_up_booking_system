package M;
import java.util.ArrayList;
import java.util.List;


public interface DemoDao {  
	//我是demo方法
public User get(String username,String password);
	
	public long getCountWithName(String name);
	
	public void add(User user);
}
