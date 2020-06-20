package M;

import java.util.ArrayList;
import java.util.List;



public interface photographerdao {
	//获取摄影师信息
	public List<photographer> getCirteriaphers(CriteriaPhotographer pher);
	public photographer get_by_id(String id);
}
