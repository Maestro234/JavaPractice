package pangram;

import java.util.ArrayList;

public class Pangram {

	public static void main(String[] args) {
		String test = "The quick brown fox jumps over the lazy dog";
		System.out.println(pangram(test));

	}

	
	public static String pangram(String sentence) {
		
		
		boolean[] check = new boolean[26];
		ArrayList<String> missing = new ArrayList<>();
		ArrayList<String> alphabets = new ArrayList<>();
		alphabets.add("A");alphabets.add("B");alphabets.add("C");
		alphabets.add("D");alphabets.add("E");alphabets.add("F");
		alphabets.add("G");alphabets.add("H");alphabets.add("I");
		alphabets.add("J");alphabets.add("K");alphabets.add("L");
		alphabets.add("M");alphabets.add("N");alphabets.add("O");
		alphabets.add("P");alphabets.add("Q");alphabets.add("R");
		alphabets.add("S");alphabets.add("T");alphabets.add("U");
		alphabets.add("V");alphabets.add("W");alphabets.add("X");
		alphabets.add("Y");alphabets.add("Z");
		int indexOfLetterFound = 0;
		
		
		// if A <= alphabet <= Z
		//if the alphabet is between A and Z
		//get the index of the alphabet from A by subtracting the alphabet from A(initial starting point)
		for (int i=0; i < sentence.length(); i++) {
			
			if('A' <= sentence.toUpperCase().charAt(i) && sentence.toUpperCase().charAt(i) <= 'Z' ) {
				indexOfLetterFound = sentence.toUpperCase().charAt(i) - 'A';
			}
			//mark that position in the array as true if found
			check[indexOfLetterFound]= true;
		}
		
		for(int j=0; j < check.length; j++) {
			if( check[j] == false) 
				missing.add(alphabets.get(j));
		}
		
		if (missing.isEmpty())
			return "All characters found:::: is a pangram";
		else 
			return missing.toString();
	
	}
}
