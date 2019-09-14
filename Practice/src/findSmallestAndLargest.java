//import java.util.*;


public class findSmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,2,8,7,7,87};
		
		
//		int minUsingJavaStream = java.util.Arrays.stream(arr).min().getAsInt();
//		int maxUsingJavaStream = java.util.Arrays.stream(arr).max().getAsInt();

		System.out.println(find(arr));
	}
	
	public static String find(int[] arr) {
		Integer max = arr[0];
		Integer min = arr[0];
		
		
		
		for (int i=1; i<arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		
		return "min: " +min + " and max: " +max;
	}

}
