package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {
	 public  int seConnecter(User user) throws SQLException {
		 int iduser=0;
		    Connection con=oracleConnection.dbconnect();
			Statement stm=con.createStatement();
			ResultSet rows = stm.executeQuery("select * from userr where iduser = "+user.getIdUser()+"");
	      //  User LoadedUser =(User) stm.executeQuery("select * from userr where iduser = "+user.getIdUser()+"");
			while (rows.next()) {
                iduser=rows.getInt("userid");
                

                }
			con.close();
			System.out.println(iduser);
	        User LoadedUser = (User) rows.getObject(0);
//	        if (LoadedUser == null) {
//	            return -1;
//	        } else if (!LoadedUser.getPassword().equals(user.getPassword())) {
//	            return -2;
//	        } else {
//	            return 1;
//	        }
	        return 11;
	    }
	 
	 
	 public int createUser(User user) throws SQLException {
		 int n;
	        user.setIdUser(user.getIdUser());
	        user.setEmail(user.getEmail());
	        user.setJob(user.getJob());
	        user.setNom(user.getNom());
	        user.setPrenom(user.getPrenom());
	        user.setPassword(user.getPassword());
	        user.setBlocked(user.getisBlocked());
	        if(user.getisBlocked()==true) {
	        	n=1;
	        }else
	        	n=0;
	        Connection con=oracleConnection.dbconnect();
			Statement stm=con.createStatement();
	        stm.executeUpdate("insert into userr values('"+user.getIdUser()+"','"+user.getPassword()+"','"+user.getNom()+"','"+user.getPrenom()+"','"+user.getEmail()+"','"+user.getJob()+"','"+n+"')");
	        con.close();
	        return 1;
	    }

}