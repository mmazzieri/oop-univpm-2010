package it.univpm.progogg.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			while ((s = stdin.readLine()) != null)
				System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
