package M;

import java.util.List;

public interface OrderDAO {

	public long getPageCount2(criteriaorder cc);
	
	public  List<Order> getcriteriaoder(criteriaorder cc,int currPage,int pageSize);
	
	public void deleteorder(int id);
	
	public Order getorder(int id);
	
	public void updateorder(Order order);
	
	public void addorder(Order order);
}
