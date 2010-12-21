package it.univpm.progogg.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class MailSender {
	private static final String SMTP_SERVER = "localhost";
	private static final int SMTP_PORT = 25;
	
	Scanner input;
	PrintWriter output;
	
	public MailSender() throws IOException {
		this(SMTP_SERVER);
	}
	
	public MailSender(String hostName) throws IOException {
		SocketChannel channel = SocketChannel.open(new InetSocketAddress(hostName, SMTP_PORT));
		input = new Scanner(channel);
		output = new PrintWriter(Channels.newOutputStream(channel));
		receive();
	}	
	
	public void sendMail(String from, String to, String message) throws UnknownHostException {
		send("HELO " + InetAddress.getLocalHost().getHostName());
		receive();
		send("MAIL FROM <" + from + ">");
		receive();
		send("RCPT TO: <" + to + ">");
		receive();
		send("DATA");
		receive();
		send(message);
		send(".");
		receive();
	}
	
	public static void main(String[] args) {
		MailSender sender;
		try {
			sender = args.length > 0 ? new MailSender(args[0]) : new MailSender();
		} catch (IOException e) {
			System.err.println("Error opening the connection");
			return;
		}
				
		try {
			sender.sendMail("info@example.com", "m.mazzieri@univpm.it", "I enjoy learning Java with you");
		} catch (UnknownHostException e) {
			System.err.println("Unknown host");
		}
	}
	
	private void send(String message) {
		System.out.println(message);
		output.println(message);
		output.flush();
	}
	
	private void receive() {
		System.out.println(input.nextLine());
	}

}
