package test;


import oracle.User;
import oracle.UserService;
import oracle.ServiceServer;
import oracle.ServiceClient;

public class yoyo {
	public static void main(String[] args) throws Exception {
		ServiceServer srv = new ServiceServer();
		
		System.out.println(srv.getPort());
		System.out.println(srv.getServer_IP());
		}
}
