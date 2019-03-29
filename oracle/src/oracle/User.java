package oracle;

public class User {
private int IdUser;
private String nom,prenom,email,job;
private boolean isBlocked=false;


public User() {
	super();
}

public User(int idUser, String nom, String prenom, String email, String job, boolean isBlocked) {
	super();
	IdUser = idUser;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.job = job;
	this.isBlocked = isBlocked;
}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public boolean isBlocked() {
	return isBlocked;
}
public void setBlocked(boolean isBlocked) {
	this.isBlocked = isBlocked;
}

public int getIduser() {
	return IdUser;
}

public void setIduser(int iduser) {
	IdUser = iduser;
}



}
