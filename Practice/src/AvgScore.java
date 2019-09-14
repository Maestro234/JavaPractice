package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AvgScore {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Joe", 100);
		map.put("Safwan", 90);
		map.put("Steven", 70);
		map.put("Abe", 80);
		map.put("David", 60);
		map.put("Lisa", 50);
		map.put("Jane", 50);
		map.put("Name", 50);
		map.put("Zabi", 60);
		map.put("Nathan", 100);
		
		System.out.println(getAllBelowAverage(map));
	}

	
	public static List<String> getAllBelowAverage (Map<String, Integer> grades) {
		
		Integer totalScore = 0;
		Integer avg = 0;
		List<String> studentNames = new ArrayList<>();
		for(Entry<String, Integer> entry : grades.entrySet()) {
			totalScore += entry.getValue();
		}
		avg = (int) Math.floor(totalScore/grades.size());
		
		for(Entry<String, Integer> entry2 : grades.entrySet()) {
			if(entry2.getValue() <= avg) {
				studentNames.add(entry2.getKey());
			}
		}
		return studentNames;
	}
}
