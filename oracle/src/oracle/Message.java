package oracle;

public class Message {
private int IdMessage,IdUser;
private String corpsMessage;
private boolean doesRequireAttention=false;

public Message() {
	super();
}
public Message(int idMessage, int idUser, String corpsMessage, boolean doesRequireAttention) {
	super();
	IdMessage = idMessage;
	IdUser = idUser;
	this.corpsMessage = corpsMessage;
	this.doesRequireAttention = doesRequireAttention;
}
public int getIdMessage() {
	return IdMessage;
}
public void setIdMessage(int idMessage) {
	IdMessage = idMessage;
}
public int getIdUser() {
	return IdUser;
}
public void setIdUser(int idUser) {
	IdUser = idUser;
}
public String getCorpsMessage() {
	return corpsMessage;
}
public void setCorpsMessage(String corpsMessage) {
	this.corpsMessage = corpsMessage;
}
public boolean isDoesRequireAttention() {
	return doesRequireAttention;
}
public void setDoesRequireAttention(boolean doesRequireAttention) {
	this.doesRequireAttention = doesRequireAttention;
}

}
