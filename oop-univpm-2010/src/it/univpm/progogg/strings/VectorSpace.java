package it.univpm.progogg.strings;

import java.util.Map;
import java.util.TreeMap;

public class VectorSpace {
	private Map<String, Integer> vocabulary = new TreeMap<String, Integer>();
	private Map<String, double[]> documents = new TreeMap<String, double[]>();

	public void add(String name, String text) {
		// frequencies of words in the new text
		TreeMap<Integer, Integer> frequencies = new TreeMap<Integer, Integer>();
		for (String word : text.split("\\W")) {
			int index = indexOfWord(word);
			Integer value = frequencies.get(index);
			frequencies.put(index, value == null ? 1 : value++);
		}

		// the new document d
		if (frequencies.size() > 0)
			documents.put(name, normalize(frequencies));
	}

	public double[] encode(String text) {
		TreeMap<Integer, Integer> frequencies = new TreeMap<Integer, Integer>();
		for (String word : text.split("\\W"))
			if (vocabulary.containsKey(word)) {
				int index = vocabulary.get(word);
				Integer value = frequencies.get(index);
				frequencies.put(index, value == null ? 1 : value++);
			}

		return normalize(frequencies);
	}

	public double[][] getMatrix() {
		double[][] result = new double[vocabulary.size()][];
		int dn = 0;
		for (String d : documents.keySet())
			result[dn++] = documents.get(d);
		return result;
	}

	private int indexOfWord(String term) {
		Integer index = vocabulary.get(term);
		if (index != null)
			return index;

		int result = vocabulary.size();
		vocabulary.put(term, result);
		return result;
	}

	private double[] normalize(TreeMap<Integer, Integer> frequencies) {
		double[] result = new double[vocabulary.size()];
		int sum = 0;
		for (int w : frequencies.keySet()) {
			int f = frequencies.get(w);
			result[w] = f;
			sum += f;
		}

		for (int i = 0; i < result.length; i++)
			result[i] /= sum;

		return result;
	}
}
