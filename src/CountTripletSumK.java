import java.util.Arrays;

public class CountTripletSumK {
   /*count the number of triplets which results the sum of two numbers equals the third
   yes lets begin
    */
    public static int countTripletsWithSumK(int[] arr, int n){
        //sort array first
        Arrays.sort(arr);
        int i, j, k;
        int count = 0;
        // take a pointer from end
        for(k= n-1; k> 0; k--){
            //one from the start and other from the second last
            i=0;
            j= k-1;
            //until the both points meet
            while(j<i){
                if(arr[i]+arr[j] == arr[k]){
                    //if yes increment the count and the pointers respectively
                    count ++;
                    i++;
                    j--;
                }else if(arr[i] +arr[j]< arr[k]){
                    i++;
                }
                else{
                    j--;
                }//after the while loop, will go for another iteration with k... and so on
            }
        }return count;
    }

    public static void main(String[] args) {

    }
}
