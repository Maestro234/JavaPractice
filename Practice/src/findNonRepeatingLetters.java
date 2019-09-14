import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class findNonRepeatingLetters {

	public static void main(String[] args) {
		String word = "nabina";
		
		System.out.println(getNonRepeatingLetters(word));

	}
	
	public static List<String> getNonRepeatingLetters(String word) {
		
		//instantiate a map to keep track of each letters and their occurrence
		Map <String, Integer> map = new HashMap<>();
		Integer wordCount = 0;
		//list to store and return all the non repeating letters 
		List<String> listOfNonRepeatingLetters = new ArrayList<>();
		
		
		for (int index = 0; index < word.length(); index++) {
			
			/**
			 * initially the map is empty
			 * so the first iteration is always added to the map and after that if keeps checking 
			 * if the new letter already exists in the map, then get the value and increment it by one
			 */
			if(map.containsKey(word.substring(index, index+1))) {
				//retrieve the value of the letter in the map
				wordCount = map.get(word.substring(index, index+1));
				//store back in the map and increment the value by one
				map.put(word.substring(index, index+1), wordCount+1);
			}
			else {
				//if it does not exist make the count 1
				map.put(word.substring(index, index+1), 1);
			}
		}
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				listOfNonRepeatingLetters.add(entry.getKey());
			}
		}
		
		return listOfNonRepeatingLetters;
	}

}
