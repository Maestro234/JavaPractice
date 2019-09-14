package findDuplicatesInArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicate {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,3,4,4,4,4,6};
		
		System.out.println(findDuplicate(arr));

	}
	
	public static String findDuplicate(Integer[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		String duplicates="";
		
		for(int i=0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				//get the value
				count = map.get(arr[i]);
				//increment the count of the element by 1
				map.put(arr[i], count+1);
			}else {
				//save if it does not exist in the map
				map.put(arr[i], 1);
			}
				
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				duplicates += "found " + entry.getKey() + " occurs " + entry.getValue() + " times | ";			
		}
		return "The duplicates are: " + duplicates;
	}

}
