import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int count = 0;
		for(String s : hashmap1.keySet()) {
			if(hashmap1.get(s).equals(hashmap2.get(s))) {
				count++;
			}
		}
		return count;
	}

}
