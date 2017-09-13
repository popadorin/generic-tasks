package marcs_tasks.task3;

public class StringHelper {

	public String getMostOccurredLetter(String string) {
		char mostOccurredChar = ' ';
        	int counter = 0;
        	int[] charsOccurrences = new int[Character.MAX_VALUE + 1];
	
	        for (int i = 0 ; i < s.length() ; i++) {
       		    char ch = string.charAt(i);
		    if (!Character.isLetter(ch)) {
                        continue;
            	    }

	            charsOccurrences[ch]++ ;
        	    if (charsOccurrences[ch] >= counter) {
                	counter = charsOccurrences[ch];
            	    	mostOccurredChar = ch;
            	    }
        	}

	        return String.valueOf(mostOccurredChar);
	}
}
