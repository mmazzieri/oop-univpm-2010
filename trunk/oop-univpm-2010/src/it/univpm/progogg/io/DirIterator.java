package it.univpm.progogg.io;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DirIterator implements Iterator<File> {

	private LinkedList<File> listFiles = new LinkedList<File>();

	public DirIterator() {
		this(".");
	}

	public DirIterator(String dir) {
		File d = new File(dir);
		for (File f : d.listFiles())
			listFiles.add(f);
	}

	@Override
	public boolean hasNext() {
		return !listFiles.isEmpty();
	}

	@Override
	public File next() {
		File result = listFiles.pollFirst();
		if (result == null)
			throw new NoSuchElementException();
		//if (result.isDirectory())
			for (File f : result.listFiles())
				listFiles.add(f);
		return result;
	}

	@Override
	public void remove() {
		throw new NotImplementedException();
	}
	
	public static void main(String[] args) {
		DirIterator dir = args.length == 0 ? new DirIterator() : new DirIterator(args[0]);
		while (dir.hasNext())
			System.out.println(dir.next());
	}

}
