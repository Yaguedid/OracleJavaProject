package oracle;
import java.sql.*;


public class oracleConnection {

public static Connection dbconnect()
{
	try {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection(
					"jdbc:oracle:thin@localhost:1521:orcl","ABCDE","ABCDE");
		return conn;
		
	 }catch(Exception e)
	{
		return null;
	}
	
}
}
