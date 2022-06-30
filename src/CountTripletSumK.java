public class CountTripletSumK {
    public static int countTripletsWithSumK(int[] arr, int n){
        int i, j, k;
        int count = 0;
        for(k= n-1; k> 0; k--){
            i=0;
            j= k-1;
            while(j<i){
                if(arr[i]+arr[j] == arr[k]){
                    count ++;
                    i++;
                    j--;
                }else if(arr[i] +arr[j]< arr[k]){
                    i++;
                }
                else{
                    j--;
                }
            }
        }return count;
    }

    public static void main(String[] args) {

    }
}
