package M;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import C.ReflectionUtils;


/**
 * 封装了基本的CRUD的方法，以供子类继承使用
 * @author yb
 * 采用DBUtils解决方案
 *<T>  当前DAO处理的实体类的类型是类型
 */
public class DAO<T> {

	private Class<T>  clazz;
	
	public DAO() {
		clazz=  ReflectionUtils.getSuperGenericType(getClass());
	}
	private QueryRunner queryRunner=new QueryRunner();
	/**
	 * 返回某一个字段的值，比如：返回某一条记录的CustomerName,或者是使用聚集函数，比如会员数  count(*)
	 * @param sql
	 * @param args
	 * @return
	 */
	public  <E> E getForValue(String  sql, Object...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
            return (E) queryRunner.query(connection, sql, new ScalarHandler(), args);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	
	/**
	 * 返回T所对应的List
	 * @param sql
	 * @param args
	 * @return
	 */
	public List<T> getForList(String sql, Object...args){
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
            return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	
	/**
	 * 返回对应的T的一个实体类的对象
	 * @param sql
	 * @param args
	 * @return
	 */
	public T get(String sql, Object...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
            return queryRunner.query(connection, sql, new BeanHandler<>(clazz), args);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
	
	/**
	 * 封装了insert,delete,update操作
	 * @param sql  SQL语句
	 * @param args 填充SQL语句中的点位符的参数值
	 */
	public void update(String sql,  Object...args) {
		Connection connection=null;
		try {
			connection=JdbcUtils.getConnection();
			queryRunner.update(connection,sql, args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.releaseConnection(connection);
		}
	}

}