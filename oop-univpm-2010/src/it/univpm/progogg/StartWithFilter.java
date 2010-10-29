package it.univpm.progogg;

import java.io.File;
import java.io.FilenameFilter;

public class StartWithFilter implements FilenameFilter {
	private String s;
	
	public StartWithFilter(String s) {
		this.s = s;
	}

	@Override
	public boolean accept(File dir, String f) {
		return f.startsWith(s);
	}
	
	
}
