package oracle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServiceClient {
	private Socket connection;
	private String adresse;
	private int port;
	private String   msgSent;
	private String 	msgReceived;
	private DataInputStream inStream;
	private DataOutputStream outStream;
	
	public ServiceClient(String adresse, int port) throws Exception {
		
		this.adresse = adresse;
		this.port = port;
		  
			connection=new Socket(adresse,port);
			inStream=new DataInputStream(connection.getInputStream());
			outStream=new  DataOutputStream (connection.getOutputStream());
		
	
	}
	
	
	public String getMsgReceived() throws Exception {
		 
	    if(!msgReceived.trim().equals("exit"))
	     {
	    	
				msgReceived=inStream.readUTF();
			
	    	 return msgReceived;
	         
	     }
	    connection.close();  
	    return "";
	}

	// hadi ghdi t3yt aliha min tbghi tssift chi mssg 
	public void setMsgSent(String msg) throws Exception{
		this.msgSent = msg;
		
			outStream.writeUTF(msgSent);
		
	}

}
