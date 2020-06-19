package M.phUserdao;

import java.util.List;

import C.phUserCriteria.phCriteria;
import M.phUser.phUser;



public interface phUserDao {
public List<phUser> getAll();
	
	public phUser get(Integer id);
	
	public long getCountWithName(String name);
	
	public void delete(Integer id);
	
	public void update(phUser user);
	
	public void add(phUser user);
	
	
	public phUser login(String username, String password);
	
	public int Count(List<phUser> users);
	
	public List<phUser> CriteriaUser(phCriteria cc);
	
	public List<phUser> selectUser(List<phUser> users,int currentPage,int pageSize);
	
	public List<phUser> selectUser2(List<phUser> users,int currPage,int pageSize,int endSize);
	
	public List<phUser> getViewlist(String list);
}
