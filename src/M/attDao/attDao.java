package M.attDao;

import java.util.List;

import C.phUserCriteria.attCriteria;
import M.attractions.attractions;
import M.phUser.phUser;



public interface attDao {
public List<attractions> attCriteria(attCriteria cc);
	
	public List<attractions> selectUser(List<attractions> users,int currentPage,int pageSize);
	
	public List<attractions> selectUser2(List<attractions> users,int currPage,int pageSize,int endSize);
	
	public int Count(List<attractions> users);
	
	public void delete(Integer id);
	public attractions get(Integer id);
	public long getCountWithName(String name);
	public void update(attractions user);
}
