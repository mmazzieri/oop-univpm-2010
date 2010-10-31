package it.univpm.progogg.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTextFile {

	BufferedReader file;

	public BufferedTextFile(String name) throws FileNotFoundException {
		file = new BufferedReader(new FileReader(name));
	}

	@Override
	public String toString() {
		String s;
		StringBuilder result = new StringBuilder();
		try {
			while ((s = file.readLine()) != null)
				result.append(s);
		} catch (IOException e) {
			result.append(e.getStackTrace());
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String[] files = args.length == 0 ? new File(".").list() : args;
		for (String f : files)
			try {
				System.out.println(new BufferedTextFile(f));
			} catch (FileNotFoundException e) {
				System.out.print(f);
				System.out.println(" not found");
			}
	}

}
