package M;

import java.util.List;

public class OrderDAOJdbcimpl extends DAO<Order> implements OrderDAO{
	
	public long getPageCount2(criteriaorder cc)
	{
		 String sql="select count(*) from `order` where username like ? and ph_username like ? and status like ?";
		 return  getForValue(sql,cc.getUsername(),cc.getPh_username(),cc.getStatus());
	}
	
	@Override
	public  List<Order> getcriteriaoder(criteriaorder cc,int currPage,int pageSize) {
		// TODO Auto-generated method stub
	  String sql="select * from `order` where username like ? and ph_username like ? and status like ? limit ?,?";
	 return getForList(sql,cc.getUsername(),cc.getPh_username(),cc.getStatus(),(currPage-1)*pageSize,pageSize);
	}
	
	@Override
	public void deleteorder(int id) {
		// TODO Auto-generated method stub
		String sql="delete from `order` where id=?";
		update(sql,id);
	}
	
	 @Override
	    public Order getorder(int id) {
	    		// TODO Auto-generated method stub
	    		String sql="select * from `order` where id=?";
	    		return get(sql,id);
	    }
	 
	 @Override
		public void updateorder(Order order) {
			// TODO Auto-generated method stub
			String sql="update `order` set username=?,gender=?,phonenumber=?,ph_id=?,ph_username=?,ph_gender=?,ph_phonenumber=?,status=? where id=?";
			update(sql,order.getUsername(),order.getGender(),order.getPhonenumber(),order.getPh_id(),order.getPh_username(),order.getPh_gender(),order.getPh_phonenumber(),order.getStatus(),order.getId());
		}
	 
	 @Override
		public void addorder(Order order) {
			// TODO Auto-generated method stub
			String sql="insert into `order`(username,gender,phonenumber,ph_id,ph_username,ph_gender,ph_phonenumber,status) values(?,?,?,?,?,?,?,?)" ;
			update(sql,order.getUsername(),order.getGender(),order.getPhonenumber(),order.getPh_id(),order.getPh_username(),order.getPh_gender(),order.getPh_phonenumber(),order.getStatus());
		}
	
}
