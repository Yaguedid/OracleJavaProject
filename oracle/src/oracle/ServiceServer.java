package oracle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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


public ServiceServer()  {
	
	try {
		server=new ServerSocket(0);
		port=server.getLocalPort();
		connection=server.accept();
		inStream=new DataInputStream(connection.getInputStream());
		outStream=new  DataOutputStream (connection.getOutputStream());
	} catch (IOException e) {		
		e.printStackTrace();
	}
}


public int getPort() {
	return port;
}
// hadi ghadi tb9a t3yt 3liha bchi tread ola chi haja 
//o takhod dakchi li ghadi t3tih lik o tktbo f chi textField

public String getMsgReceived() {
	 
    if(!msgReceived.trim().equals("exit"))
     {
    	 try {
			msgReceived=inStream.readUTF();
		} catch (IOException e) {			
			e.printStackTrace();
		}
    	 return msgReceived;
         
     }
    return "";
}

// hadi ghdi t3yt aliha min tbghi tssift chi mssg 
public void setMsgSent(String msg) {
	this.msgSent = msg;
	try {
		outStream.writeUTF(msgSent);
	} catch (IOException e) {		
		e.printStackTrace();
	}
}



}
