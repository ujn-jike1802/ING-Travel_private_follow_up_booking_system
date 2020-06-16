package M;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Connection;

/**
 * jdbc的工具类
 * @author Yangb
 *
 */
public class JdbcUtils {
	/**
	 * 释放conn连接
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
	   //数据源只能被创建一次
	   dataSource=new ComboPooledDataSource("bookingdemo");
   }
   /**
    * 返回数据源的一个Connection对象
    * @return
    * @throws SQLException 
    */
   public static java.sql.Connection getConnection() throws SQLException {
	   return dataSource.getConnection();
   }
}
