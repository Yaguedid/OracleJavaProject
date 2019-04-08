package test;

import java.sql.SQLException;

import oracle.User;
import oracle.UserService;

public class yoyo {
	public static void main(String[] args) throws SQLException {
	     User user = new User(1,"azerty", "oualili", "younesse", "youness@gmail.com", "user", false);
	     UserService srv = new UserService();
	     int res=srv.seConnecter(user);
	     System.out.println(res);
		}
}
