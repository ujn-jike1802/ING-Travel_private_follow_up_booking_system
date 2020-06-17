package M;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

	public static void releaseConnection(Connection connection) {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static DataSource dataSource=null;
	
	static {
		dataSource=new ComboPooledDataSource("bookingdemo");
	}
	
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
