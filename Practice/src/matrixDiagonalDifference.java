
public class matrixDiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int primary=0;
        int secondary=0;

        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr.length; col++) {
            //if the column[0] row[0] then sum
                if (row == col){
                	/*1 - -
                	 * - 1 -
                	 * - - 1
                	 * */
                    primary+=arr[row][col];
                    /*- - 1
                     * - 1 -
                     * 1 - -*/
                    secondary+=arr[row][arr.length-col-1];
                }
               
            }
        }
        return Math.abs(primary-secondary);

    }


    public static void main(String[] args) {
     
    	 int arr[][] = 
    	        { 
    	            {11, 2, 4}, 
    	            {4 , 5, 6}, 
    	            {10, 8, -12} 
    	        }; 
    	  System.out.println( diagonalDifference(arr));
    }
}
