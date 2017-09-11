package marcs_tasks.task4;

import java.util.Map;


public class Main {
	public static void main(String ...args) {
		MapHelper mapHelper = new MapHelper();
		
	    Map<String, Integer> valuesAndOccurences = mapHelper.getValuesAndOccurences("Jora", "Grisha", "Jora", "Aliona"); 
		print(valuesAndOccurences);
	    
	}
	
	private static void print(Map<String, Integer> valuesAndOccurences) {
		for (String key : valuesAndOccurences.keySet()) {
	    	System.out.println("value: " + key + ", nrOfOccurences: " + valuesAndOccurences.get(key));
	    }
	}
	
}
