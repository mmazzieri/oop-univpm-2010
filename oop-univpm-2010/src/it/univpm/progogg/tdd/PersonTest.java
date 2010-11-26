package it.univpm.progogg.tdd;

import it.univpm.progogg.Person;

import org.junit.*;

public class PersonTest {
	
	Person p;

	@Before
	public void setUp() {
		p = new Person("Mauro Mazzieri");
	}
	
	@Test
	public void testToString() {
		Assert.assertEquals("sono diversi", p.toString(), "Mauro Mzzieri");
	}

}
