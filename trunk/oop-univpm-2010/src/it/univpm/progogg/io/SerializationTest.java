package it.univpm.progogg.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import it.univpm.progogg.Person;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// a person
		Person p1 = new Person("Mario");
		p1.whoAmI();
		
		// serialize
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.out"));
		out.writeObject(p1);
		out.close();
		
		// deserialize
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.out"));
		Person p2 = (Person)in.readObject();
		p2.whoAmI();
		new File("persona.out").delete();
	}

}
