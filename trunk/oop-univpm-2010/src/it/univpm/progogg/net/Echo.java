package it.univpm.progogg.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * A multi-threaded echo server: prints back the received text.
 * @author Mauro Mazzieri
 *
 */
public class Echo extends Thread {

	private Socket s;
	
	public Echo(Socket s) {
		this.s = s;
	}
	
	public void run() {
		Scanner input;
		try {
			input = new Scanner(s.getInputStream());
		} catch (IOException e) {
			System.err.println("I/O error creating the input stream");
			return;
		}
		
		PrintWriter output;
		try {
			output = new PrintWriter(s.getOutputStream(), /* auto flush the output buffer */ true);
		} catch (IOException e) {
			System.err.println("I/O error creating the output stream");
			return;
		}
		
		boolean done = false;
		while(input.hasNextLine() && !done) {
			String line = input.nextLine();
			done = line.length() == 0;
			output.println(line);
		}
		
		try {
			s.close();
		} catch (IOException e) {
			System.err.println("I/O error closing the socket");
			return;
		}
	}
	
	public static void main(String[] args) {
		ServerSocket ss;
		try {
			ss = new ServerSocket(1234);
		} catch (IOException e) {
			System.err.println("I/O error when opening the socket");
			return;
		}
		
		while (true) {
			Socket s;
			try {
				s = ss.accept();
			} catch (IOException e) {
				System.err.println("I/O error waiting for the connection");
				return;
			}
			
			new Echo(s).start();
		}
	}
}
