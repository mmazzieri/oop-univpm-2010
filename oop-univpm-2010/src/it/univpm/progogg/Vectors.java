package it.univpm.progogg;

public class Vectors {

	int sumVector(int[] v) {
		int result = 0;
		for (int i : v)
			result += i;
		return result;
	}

	static int sum(int... v) {
		int result = 0;
		for (int i : v)
			result += i;
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] vett;
		Light[] lamps;
		int[] a1 = { 1, 2, 3, 4, 5 };
		Light[] l1 = new Light[5];
		Light[] l2 = l1;
		System.out.println(l2.length);
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1, 4, 7));
		System.out.println(sum(1, 4, 5, 8, 2, 4));
	}

}
