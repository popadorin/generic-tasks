package marcs_tasks.task2;

import marcs_tasks.task1.Pair;

public class WordsHelper {

	public Pair<String, String> getWords(String string) {
		String[] words = string.split("\\s+");
		
		String shortestString = generateString(string.length());
		String longestString = "";
		
		for (String word : words) {
			if (word.length() < shortestString.length()) {
				shortestString = word;
			}
			
			if (word.length() > longestString.length()) {
				longestString = word;
			}
		}
		
		return new Pair<>(shortestString, longestString);
	}
	
	private String generateString(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append("a");
		}
		
		return sb.toString();
	}
}
