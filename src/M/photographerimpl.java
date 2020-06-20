package M;


import java.util.ArrayList;
import java.util.List;



public class photographerimpl extends DAO<photographer>  implements photographerdao{

	@Override
	public List<photographer> getCirteriaphers(CriteriaPhotographer pher) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM photographer WHERE ph_username like ?";
		return (List<photographer>) getForList(sql,pher.getUsername());
		}

	@Override
	public photographer get_by_id(String id) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM photographer WHERE ph_id = ?";
		return get(sql,id);
	}
	
}
