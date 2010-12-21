package it.univpm.progogg.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostByName {

	public static void main(String[] args) {
		if (args.length > 0) {
			for (String hostName : args) {
				System.out.println(hostName);
				try {
					for (InetAddress address : InetAddress.getAllByName(hostName))
						System.out.println(address);
				} catch (UnknownHostException e) {
					System.err.println("host not found");
				}
				System.out.println();
			}
		} else {
			System.out.println("localhost");
			InetAddress address;
			try {
				address = InetAddress.getLocalHost();
			} catch (UnknownHostException e) {
				System.err.println("local host not found");
				return;
			}
			
			System.out.println(address);
			System.out.println();			
		}
	}

}
