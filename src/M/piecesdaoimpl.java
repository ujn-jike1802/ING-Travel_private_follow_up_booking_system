package M;

import java.util.List;

public class piecesdaoimpl  extends DAO<pieces> implements piecesdao {

	@Override
	public List<pieces> getpieces_by_id(int id) {
		// TODO Auto-generated method stub
		String sql="SELECT id,photo_src,photo_time,photo_place,photo_theme FROM pieces WHERE id=?";
		return getForList(sql,id);
	}


}
