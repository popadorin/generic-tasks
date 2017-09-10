package marcs_tasks.task4;

import java.util.Map;
import java.util.HashMap;

public class MapHelper {

    public <T> Map<T, Integer> getValuesAndOccurences(T ...args) {
        HashMap<T, Integer> valuesAndOccurences = new HashMap<>(); // dict with word name key and frequency value

        for (T arg : args) {
            if (valuesAndOccurences.containsKey(arg)) {
                valuesAndOccurences.put(arg, valuesAndOccurences.get(arg) + 1);
            } else {
                valuesAndOccurences.put(arg, 1);
            }
        }

        return valuesAndOccurences;
    }
	
}
