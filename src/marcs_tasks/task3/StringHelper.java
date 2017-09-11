package marcs_tasks.task3;

public class StringHelper {

	public String getMostOccuringLetter(String str) {
		int temp = 0;
	    int count = 0;
	    char[] letters = {'a','b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	    int[] numChar = new int[26];
	    char letter;
	    String s = "";
	    str = str.toLowerCase();
	    for (int i = 0; i < 26; i++) {
	        count = 0;
	        for (int j = 0; j < str.length(); j++) {
	            letter = str.charAt(j);
	            if (letters[i] == letter) {
	                count++;
	            }
	        }
	        numChar[i] = count++;
	    }
	    temp = numChar[0];

	    for (int i = 1; i < numChar.length; i++) {
	        if (temp < numChar[i]) {
	            temp = numChar[i];
	            break;
	        }
	    }
	    
        for (int c = 0; c < 26; c++) {
            if (numChar[c] == temp)
            s = "" + letters[c];
        }

	    return s;

	}
}
