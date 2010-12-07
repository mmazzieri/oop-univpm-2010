package it.univpm.progogg.array;

import java.util.Arrays;
import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {

	@Override
	public int compare(Score s1, Score s2) {
		if (s1.points() > s2.points())
			return -1;
		if (s1.points() < s2.points())
			return 1;
		return s1.seconds() < s2.seconds() ? -1 : (s1.seconds() > s2.seconds() ? 1 : 0);
	}
	
	public static void main(String[] args) {
		Score[] s = new Score[] { new Score(3, 10), new Score(3, 8), new Score(2, 11) };
		Arrays.sort(s, new ScoreComparator());
		for (Score item : s)
			System.out.println(item);
	}

}
