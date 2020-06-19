package M;

import java.util.List;

public class orderdaoimpl  extends DAO<order> implements orderdao {

	@Override
	public long getorderNumber(String id,Criteriaorder criteriorder) {
		// TODO Auto-generated method stub
		 String sql="select count(*) from order WHERE id = ? AND ph_id like ? AND ph_username like ? AND ph_gender like ?";
		 return getForValue(sql,id,criteriorder.getId(),criteriorder.getUsername(),criteriorder.getGender());
	}

	@Override
	public List<order> getCirteriaorder(String id,Criteriaorder criteriorder, PageMan pageMan) {
		// TODO Auto-generated method stub
		String sql="SELECT ph_id,ph_username,ph_gender,ph_phonenumber FROM order WHERE id=? AND ph_id like ? AND ph_username like ? AND ph_gender like ? limit ?,?";
		return getForList(sql,id,criteriorder.getId(),criteriorder.getUsername(),criteriorder.getGender(),(pageMan.getCurrent()-1)*pageMan.getPageSize(),pageMan.getPageSize());
	}

	@Override
	public long getordernumber(String ph_id, Criteriaorder criteriorder) {
		 String sql="select count(*) from order WHERE ph_id = ? AND id like ? AND username like ? AND gender like ?";
		 return getForValue(sql,ph_id,criteriorder.getId(),criteriorder.getUsername(),criteriorder.getGender());
	}

	@Override
	public List<order> getCirteriaOrder(String ph_id, Criteriaorder criteriorder, PageMan pageMan) {
		String sql="SELECT id,username,gender,phonenumber FROM order WHERE ph_id=? AND id like ? AND username like ? AND gender like ? limit ?,?";
		return getForList(sql,ph_id,criteriorder.getId(),criteriorder.getUsername(),criteriorder.getGender(),(pageMan.getCurrent()-1)*pageMan.getPageSize(),pageMan.getPageSize());
	}

	@Override
	public void delete_by_User(String orderid) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM order WHERE order_id=?";
		update(sql,orderid);
	}

	@Override
	public void delete_by_Pher(String orderid) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM order WHERE order_id=?";
		update(sql,orderid);
	}
     
}
