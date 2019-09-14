public class plusMinusCounter {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int negative=0, positive=0, zeros=0;

        for(int polarity: arr){
            if(polarity > 0){
                positive+=1;
            }
            else if(polarity < 0) {
                negative+=1;
            }
            else {
                zeros+=1;
            }
        }

        System.out.println(positive/(float)arr.length);
        System.out.println(negative/(float)arr.length);
        System.out.println(zeros/(float)arr.length);

    }

   

    public static void main(String[] args) {
       
        int[] newArr = {1,1,0,-1,-1};
        plusMinus(newArr);
    }
}
