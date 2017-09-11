package marcs_tasks.task2;

import marcs_tasks.task1.Pair;

public class Main {
	public static void main(String[] args) {
		String string = "Eu ma duc la scoala";
		
		WordsHelper  wordsHelper = new WordsHelper();
		Pair<String, String> pair = wordsHelper.getWords(string);
		System.out.println(pair);
	}
	
}
