package M;

import java.util.List;

public class piecesdaoimpl  extends DAO<pieces> implements piecesdao {

	@Override
	public List<pieces> getpieces_by_id(int id) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM pieces WHERE id=?";
		return getForList(sql,id);
	}

	@Override
	public List<pieces> getpieces() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM pieces";
		return getForList(sql);
	}


}
