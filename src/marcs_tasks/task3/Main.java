package marcs_tasks.task3;

import java.util.List;

import marcs_tasks.task1.Pair;

public class Main {

	public static void main(String[] args) {
		PairHelper pairHelper = new PairHelper();
		
		String string = "Grisha maninca pirjoale zi de zi. El inca iubeste sa bea bere";
		
		Pair<String, List<String>> pair = pairHelper.getMostOccurableLetterAndContainingList(string);
		
		System.out.println("Most occured letter: " + pair.getA());
		printWords(pair.getB());
	}
	
	private static void printWords(List<String> words) {
		System.out.println("Words containing the most occured letter: ");
		for (String word : words) {
			System.out.println(word);
		}
	}
}
