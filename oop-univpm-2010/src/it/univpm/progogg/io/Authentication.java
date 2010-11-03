package it.univpm.progogg.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Authentication implements Serializable {

	private static final long serialVersionUID = -7944722864575267973L;
	
	private String username;
	private transient String password;
	
	public Authentication(String username) {
		this(username, null);
	}
	
	public Authentication(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return username;
	}
	
	public boolean authenticate(String password) {
		return this.password != null && this.password.equals(password);
	}
	
	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		s.writeObject(new StringBuffer(password).reverse().toString());
	}
	
	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		s.defaultReadObject();
		password = new StringBuffer((String)s.readObject()).reverse().toString();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// an authentication
		Authentication a  = new Authentication("Luser", "123");
		System.out.println(a);
		System.out.println(a.authenticate("123"));
		
		// serialize
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("authentication.out"));
		out.writeObject(a);
		out.close();
		
		// deserialize
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("authentication.out"));
		Authentication a2 = (Authentication)in.readObject();
		System.out.println(a2);
		System.out.println(a2.authenticate("123"));
	}

}
