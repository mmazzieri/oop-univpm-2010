package it.univpm.progogg.array;

public class Score implements Comparable<Score> {
	int points;
	int seconds;
	
	public Score(int points, int seconds) {
		this.points = points;
		this.seconds = seconds;
	}
	
	public int points() {
		return points;
	}
	
	public int seconds() {
		return seconds;
	}
	
	@Override
	public String toString() {
		return points + " (" + seconds + "s)";
	}
	
	@Override
	public int compareTo(Score o) {
		if (points < o.points)
			return -1;
		if (points > o.points)
			return 1;
		return seconds > o.seconds ? -1 : (seconds < o.seconds ? 1 : 0);
	}	 
	
}
