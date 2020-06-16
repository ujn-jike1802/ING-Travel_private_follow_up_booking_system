package M;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import C.ReflectionUtils;


/**
 * ��װ�˻�����CRUD�ķ������Թ�����̳�ʹ��
 * @author yb
 * ����DBUtils�������
 *<T>  ��ǰDAO�����ʵ���������������
 */
public class DAO<T> {

	private Class<T>  clazz;
	
	public DAO() {
		clazz=  ReflectionUtils.getSuperGenericType(getClass());
	}
	private QueryRunner queryRunner=new QueryRunner();
	/**
	 * ����ĳһ���ֶε�ֵ,������ʹ�þۼ������������û���  count(*)
	 * @param sql
	 * @param args
	 * @return
	 */
	@SuppressWarnings("unchecked")
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
	 * ����T����Ӧ��List
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
	 * ���ض�Ӧ��T��һ��ʵ����Ķ���
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
	 * ��װ��insert,delete,update����
	 * @param sql  SQL���
	 * @param args ���SQL����еĵ�λ���Ĳ���ֵ
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
