package oracle;
import java.sql.*;


public class oracleConnection {

public static Connection dbconnect()
{
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","younesse","wll");
		return conn;
		
	 }catch(Exception e)
	{
		return null;
	}
	
}
}
