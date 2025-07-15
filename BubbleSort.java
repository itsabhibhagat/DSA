public class BubbleSort{
    public static void main(String[] args){
        int arr[] = {6,5,4,3,2,1};
        int n = arr.length;

        for(int i=n-1; i>=1; i--){
            int didswap = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    didswap = 1; // A swap occurred
                }
            }
            if(didswap == 0){
                break; // No swaps means the array is sorted
            }
            System.out.println("swap/n");
        }

        for(int a : arr){
            System.out.println(a+" ");
        }
    }
}