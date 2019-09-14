import java.util.ArrayList;

import java.util.List;

public class Search {

	public static void main(String[] args) {
		
		ArrayList<String> arrayString = new ArrayList<>();
		arrayString.add("hello");
		arrayString.add("bdcs");
		arrayString.add("abdcc");
		arrayString.add("hsdg");

		System.out.println(returnSearchIndex("dsd", arrayString));
		
	}

	public static List<Integer> returnSearchIndex (String pattern, List<String> searchArray) {
		
		ArrayList<Integer> patternIndexes = new ArrayList<Integer>();
		//iterate over the given array of strings
		for(String s: searchArray) {
			Integer index = 0;
			/*for every word in the array, if the word contains the search pattern
			get the position of the word in the array, and save it to a list*/
			if(s.contains(pattern)) {
				//get the position of the word in the array
				index = s.indexOf(pattern);
				//save it to a list
				patternIndexes.add(index);
			}
			
		}
		return patternIndexes;
	
	}
	
}
