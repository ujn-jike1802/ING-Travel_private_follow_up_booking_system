package M;

import java.util.List;

public interface photographerdao {
		//获取摄影师的查询
		public List<photographer> getCirteriaPh(CriteriaPhotographer pher);
		//获取摄影师id
		public  long  getPhid(CriteriaPhotographer pher);
}
