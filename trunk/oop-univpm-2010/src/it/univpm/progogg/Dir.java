package it.univpm.progogg;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Dir {

	/**
	 * Print files in the current string whose name contains the program
	 * argument
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		File path = new File(".");
		String[] list = args.length == 0 ? path.list() : path
				.list(new FilenameFilter() {

					@Override
					public boolean accept(File dir, String name) {
						return name.contains(args[0]);
					}

				});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String item : list)
			System.out.println(item);
	}

}
