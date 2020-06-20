package M;

import java.util.List;

public class orderdaoimpl  extends DAO<order> implements orderdao {

	@Override
	public long getorderNumber(String id,Criteriaorder criteriorder) {
		// TODO Auto-generated method stub
		 String sql="select count(*) from myorder WHERE id = ? AND ph_username like ? AND ph_gender like ?";
		 return getForValue(sql,id,criteriorder.getUsername(),criteriorder.getGender());
	}

	@Override
	public List<order> getCirteriaorder(String id,Criteriaorder criteriorder, PageMan pageMan) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM myorder WHERE id=?  AND ph_username like ? AND ph_gender like ? limit ?,?";
		return getForList(sql,id,criteriorder.getUsername(),criteriorder.getGender(),(pageMan.getCurrent()-1)*pageMan.getPageSize(),pageMan.getPageSize());
	}

	@Override
	public long getordernumber(String ph_id, Criteriaorder criteriorder) {
		 String sql="select count(*) from myorder WHERE ph_id = ? AND username like ? AND gender like ?";
		 return getForValue(sql,ph_id,criteriorder.getUsername(),criteriorder.getGender());
	}

	@Override
	public List<order> getCirteriaOrder(String ph_id, Criteriaorder criteriorder, PageMan pageMan) {
		String sql="SELECT * FROM myorder WHERE ph_id=? AND username like ? AND gender like ? limit ?,?";
		return getForList(sql,ph_id,criteriorder.getUsername(),criteriorder.getGender(),(pageMan.getCurrent()-1)*pageMan.getPageSize(),pageMan.getPageSize());
	}

	@Override
	public void delete_by_User(String orderid) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM myorder WHERE order_id=? ";
		update(sql,orderid);
	}

	@Override
	public void delete_by_Pher(String orderid) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM myorder WHERE order_id=? ";
		update(sql,orderid);
	}

	@Override
	public order get_order_by_oid(String id) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM myorder WHERE order_id = ?";
		return get(sql,id);
	}

	@Override
	public void update_by_Pher(order or) {
		// TODO Auto-generated method stub
		String sql="UPDATE myorder SET or_status=? WHERE order_id=?";
		update(sql,or.getOr_status(),or.getOrder_id());
	}

	@Override
	public void add(photographer pher, User user) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO myorder(id,username,gender,phonenumber,ph_id,ph_username,ph_gender,ph_phonenumber,or_status) VALUES(?,?,?,?,?,?,?,?,?)";
		update(sql,user.getId(),user.getUsername(),user.getGender(),user.getPhonenumber(),pher.getPh_id(),pher.getPh_username(),pher.getPh_gender(),pher.getPh_phonenumber(),0);
	}
     
}
