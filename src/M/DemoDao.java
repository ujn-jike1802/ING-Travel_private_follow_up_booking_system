package M;
import java.util.ArrayList;
import java.util.List;


public interface DemoDao {  
	//我是demo方法
	public void demo(classDemo user);
	//获取景点
	public attractions getById(int currPage);
	//获取景点数量
	public int getNumber();
}
