public class minMaxSum {

	// Complete the miniMaxSum function below.
	/*
	 * Complete the miniMaxSum function in the editor below. It should print two
	 * space-separated integers on one line: the minimum sum and the maximum sum of
	 * 4 of 5 elements.
	 * 
	 * miniMaxSum has the following parameter(s):
	 * 
	 * arr: an array of 5 integers
	 */
	static void miniMaxSum(int[] arr) {
		long mini = Long.MAX_VALUE;
		long max = 0;
		long sum = 0;

		// iterating thru the array
		// to find the mini sum:::get the maximum number in the array and subtract it
		// from the total sum of the array
		// to find the max sum:::get the minimum number in the array and subtract it
		// from the total sum of the array
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("sum of "+ arr[i] + " + " +sum + " = " + (sum += arr[i]));
			// the mini number
			if (mini > arr[i]) {
				mini = arr[i];
			}
			// the max number
			if (max < arr[i]) {
				max = arr[i];
			}
			
			sum += arr[i];

		}

		System.out.println(">>mini number:: " + mini);
		System.out.println(">>max number:: " + max);
		System.out.println(">>array sum:: " + sum);
		System.out.println();

		System.out.println(">> mini sum:: " + (sum - max) + " <<");
		System.out.println(">> max sum:: " + (sum - mini) + " <<");

	}

	// 2063136757 2744467344
	public static void main(String[] args) {

		int[] arr = { 256741038, 623958417, 467905213, 714532089, 938071625 };
		miniMaxSum(arr);
	}
}