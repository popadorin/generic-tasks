package marcs_tasks.task3;

import java.util.ArrayList;
import java.util.List;

import marcs_tasks.task1.Pair;

public class PairHelper {
	public Pair<String, List<String>> getMostOccurableLetterAndContainingList (String string) {
		StringHelper stringHelper = new StringHelper();
		
		String mostOccuringLetter = stringHelper.getMostOccurredLetter(string);
		List<String> wordsContainingMostOccuredLetter = new ArrayList<>();
	
		String[] words = string.split("\\s+");
		for (String word : words) {
			if (word.toLowerCase().contains(mostOccuringLetter)) {
				wordsContainingMostOccuredLetter.add(word);
			}
		}
		
		return new Pair<>(mostOccuringLetter, wordsContainingMostOccuredLetter);
	}

}
