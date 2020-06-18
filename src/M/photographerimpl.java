package M;


import java.util.ArrayList;
import java.util.List;



public class photographerimpl extends DAO<photographer>  implements photographerdao{

	@Override
	public List<photographer> getCirteriaPh(CriteriaPhotographer pher) {
		// TODO Auto-generated method stub
		String sql="SELECT id,username,gender,age FROM photographer WHERE username = ?";
		return getForList(sql,pher.getUsername());
	}


	@Override
	public long getPhid(CriteriaPhotographer pher) {
		// TODO Auto-generated method stub
		String sql="SELECT id,username,gender,age FROM photographer WHERE username like ?";
		return getForList(sql,pher.getUsername());
	}

}
