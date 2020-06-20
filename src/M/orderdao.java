package M;

import java.util.List;

public interface orderdao {
	 //获取查询的总数
     public long getorderNumber(String id,Criteriaorder  criteriorder);
     //获取记录
     public List<order> getCirteriaorder(String id,Criteriaorder criteriorder,PageMan pageMan);
     //查询记录的总数
     public long getordernumber(String ph_id,Criteriaorder  criteriorder);
     //获取记录
     public List<order> getCirteriaOrder(String ph_id,Criteriaorder criteriorder,PageMan pageMan);
     //取消预约
	 public void delete_by_User(String orderid);
	 //拒绝预约
	 public void delete_by_Pher(String orderid);
	 //接受预约
	 public order get_order_by_oid(String id);
	 //更新预约表
	 public void  update_by_Pher(order or);
	 //增加预约
	 public void  add(photographer pher,User user);
}
