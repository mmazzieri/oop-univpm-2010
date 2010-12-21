package it.univpm.progogg.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TimeOfTheDay {

	private static final String TIME_SERVER = "time.ien.it";
	
	public static void main(String[] args) {
		Socket s;
		try {
			s = new Socket(TIME_SERVER, 13);
		} catch (UnknownHostException e) {
			System.err.println("the IP address of the host " + TIME_SERVER + " could not be determined");
			return;
		} catch (IOException e) {
			System.err.println("an I/O error occurred when creating the socket");
			return;
		}
		Scanner result;
		try {
			result = new Scanner(s.getInputStream());
		} catch (IOException e) {
			System.err.println("an I/O error occurred when creating the input stream");
			return;
		}
		
		while (result.hasNextLine())
			System.out.println(result.nextLine());
		
		try {
			s.close();
		} catch (IOException e) {
			System.err.println("an I/O error occurred when closing the socket");
			return;
		}
	}

}
