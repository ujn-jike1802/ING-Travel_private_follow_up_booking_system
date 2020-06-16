package M;
import java.sql.*;
public class DBHelper {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
    private static final String USERNAME="root";
    private static final String PASSWORD="Yangbao";
    private static Connection connection=null;
   
     //静态代码块，负责加载驱动，只做一次，优先于主方法。
    static {
    	   
    	try { //加载驱动。
    		Class.forName(DRIVER);
    		
    	}catch(Exception ex){
 	 		ex.printStackTrace();
 	 	}  	 	    
    }
    public static Connection getConnection() throws Exception {
    	 if(connection==null) {
    		 connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
    		  return connection;
    	 }
    	 return connection;
    }
    
}

