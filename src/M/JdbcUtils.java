package M;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Connection;

/**
 * jdbc�Ĺ�����
 * @author Yangb
 *
 */
public class JdbcUtils {
	/**
	 * �ͷ�conn����
	 * @param connection
	 */
   public static void releaseConnection(java.sql.Connection connection) {
	   try{
		   if (connection!=null) {
		   connection.close();
	        }
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	   
   }
   
   private static DataSource dataSource=null;
   static {
	   //����Դֻ�ܱ�����һ��
	   dataSource=new ComboPooledDataSource("bookingdemo");
   }
   /**
    * ��������Դ��һ��Connection����
    * @return
    * @throws SQLException 
    */
   public static java.sql.Connection getConnection() throws SQLException {
	   return dataSource.getConnection();
   }
}
