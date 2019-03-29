package oracle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceServer {
private ServerSocket server;
private Socket connection;
private String   msgSent;
private String 	msgReceived;
private DataInputStream inStream;
private DataOutputStream outStream;
private int port;
private String server_IP;


public ServiceServer() throws Exception {
	
	
		server=new ServerSocket(0);
		port=server.getLocalPort();
		connection=server.accept();
		inStream=new DataInputStream(connection.getInputStream());
		outStream=new  DataOutputStream (connection.getOutputStream());
	
}



// hadi ghadi tb9a t3yt 3liha bchi tread ola chi haja 
//o takhod dakchi li ghadi t3tih lik o tktbo f chi textField

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
public void setMsgSent(String msg) throws Exception {
	this.msgSent = msg;	
		outStream.writeUTF(msgSent);
	
}

// hoda khass t3tihoum l clien bax itkonnecta m3ak
public int getPort() {
	return port;
}
public String getServer_IP() throws Exception {
	 InetAddress iAddress = InetAddress.getLocalHost();
     server_IP = iAddress.getHostAddress();  
	return server_IP;
}



}
