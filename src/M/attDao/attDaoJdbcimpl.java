package M.attDao;

import java.util.List;



import C.phUserCriteria.attCriteria;
import M.DAO;

import M.attractions.*;
import M.phUser.phUser;

public class attDaoJdbcimpl extends DAO<attractions> implements attDao{

	@Override
	public List<attractions> attCriteria(attCriteria cc) {
		String sql="select  id,attname,attsrc_img,attsrc_img1,attsrc_img2,attsrc_img3,glname1,glname2,glname3,atttype,opentime,lasting,seasons,attlevels,attvideo from attractions where attname like ? and atttype like ? and attlevels like ?";
		
		return getForList(sql,cc.getAttname(),cc.getAtttype(),cc.getAttlevels());
	}

	@Override
	public List<attractions> selectUser(List<attractions> users, int currentPage, int pageSize) {
		 List<attractions> lis=users.subList((currentPage-1)*pageSize, currentPage*pageSize);
			return lis;
	}

	@Override
	public List<attractions> selectUser2(List<attractions> users, int currPage, int pageSize, int endSize) {
		List<attractions> lis=users.subList((currPage-1)*pageSize, (currPage-1)*pageSize+endSize);
		return lis;
	}

	@Override
	public int Count(List<attractions> users) {
		int n=0;
		for(attractions user:users){
			n++;
		}
		return n;
	}

	@Override
	public void delete(Integer id) {
		String sql="delete from attractions where id=?";
		update(sql, id);
		
	}

	@Override
	public attractions get(Integer id) {
		String sql="select id,attname,attsrc_img,attsrc_img1,attsrc_img2,attsrc_img3,glname1,glname2,glname3,atttype,opentime,lasting,seasons,attlevels,attvideo from attractions where id=?";
		return get(sql, id);
	}
	@Override
	public long getCountWithName(String name) {
		String sql="select count(*) from  attractions where attname=?";
		return getForValue(sql, name);
	}
	@Override
	public void update(attractions user) {
		String sql="update attractions set attname=?,attsrc_img=?,attsrc_img1=?,attsrc_img2=?,attsrc_img3=?,glname1=?,glname2=?,glname3=?,atttype=?,opentime=?,lasting=?,seasons=?,attlevels=?,attvideo=? where id=?";
		update(sql,user.getAttname(),user.getAttsrc_img(),user.getAttsrc_img1(),user.getAttsrc_img2(),user.getAttsrc_img3(),user.getGlname1(),user.getGlname2(),user.getGlname3(),user.getAtttype(),user.getOpentime(),user.getLasting(),user.getSeasons(),user.getAttlevels(),user.getAttvideo(),user.getId());
		
	}
}
