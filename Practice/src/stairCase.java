public class stairCase {

    // Complete the staircase function below.
    static void staircase(int n) {

        for(int row=0; row<n; row++) {
           for(int col=1; col<=n; col++) {
        	   if (col+row<n) {
        		   System.out.print(" ");
        	   }
        	   else {
        		   System.out.print("#");
        	   }
           }
           //start a new line
           System.out.println("");
         
        }

    }

    public static void main(String[] args) {
    	staircase(4);
    }
}
