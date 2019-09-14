package reverseArray;

public class Reverse {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		reverseArray(arr);
	}
	
	
	public static void reverseArray(int[] arr) {
		//create a new array of the same length as input array
		int[] reversedArr = new int[arr.length];
		int lastPositionFromInputArr=arr.length;
		 for (int i = 0; i < arr.length; i++) { 
			 //put the first number from array a at the last position of array b
	            reversedArr[lastPositionFromInputArr-1] = arr[i]; 
	            lastPositionFromInputArr--; 
	        } 
		
		for (int k=0; k<arr.length; k++) {
			System.out.println(reversedArr[k]);
		}
	}

}
