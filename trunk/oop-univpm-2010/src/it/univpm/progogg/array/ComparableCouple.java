package it.univpm.progogg.array;

import java.util.Arrays;

import it.univpm.progogg.generics.Couple;

public class ComparableCouple<T extends Comparable<T>> extends Couple<T> implements Comparable<ComparableCouple<T>> {

	public ComparableCouple(T first, T second) {
		super(first, second);
	}

	@Override
	public int compareTo(ComparableCouple<T> c) {
		int result = first.compareTo(c.first);
		return (result == 0) ? second.compareTo(c.second) : result;		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked" })
		ComparableCouple<String>[] cs = (ComparableCouple<String>[]) new ComparableCouple[] { new ComparableCouple<String>("mario", "rossi"), new ComparableCouple<String>("antonio", "luigi"), new ComparableCouple<String>("antonio", "albino") };
		Arrays.sort(cs);
		for (ComparableCouple<String> c : cs)
			System.out.println(c);
	}

}
