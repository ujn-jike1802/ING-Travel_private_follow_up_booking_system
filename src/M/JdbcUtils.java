package M;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * jdbcUtils工具
 * @author Yangb
 *
 */
public class JdbcUtils {
	/**
	 * 
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
	   dataSource=new ComboPooledDataSource("bookingdemo");
   }
   /**
    * 获取数据源
    * @return
    * @throws SQLException 
    */
   public static java.sql.Connection getConnection() throws SQLException {
	   return dataSource.getConnection();
   }
}
