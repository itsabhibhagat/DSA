import java.util.Arrays;
public class FindSecondLargest{
    public static void main(String args[]){
        int arr[] ={10, 20, 4, 45, 69, 99, 99};


        //naive approach using the sort function
        // Time Complexity: O(nlogn + n)
        // Arrays.sort(arr);
        // int n = arr.length;

        // for(int i=n-2; i>=0; i--){
        //     if(arr[i] != arr[n-1]){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }
// ----------------------------------------------------------------------------

        //better solution for this problem using 2 loops
        // Time Complexity: O(n^2)
        // int n = arr.length;
        // int first = Integer.MIN_VALUE;
        // int second = Integer.MIN_VALUE;
        // for(int i=0; i<n-1; i++){
        //     if(arr[i]>first){
        //         first = arr[i];
        //     }
        // }
        // for(int i=0; i<n-1; i++){
        //     if(arr[i]<first && arr[i]>second){
        //         second = arr[i];
        //     }
        // }
        // System.out.println(second);

// ----------------------------------------------------------------------------
        // optimal solution using a single loop
        //time complexity O(n)
        int n= arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i< n-1; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else{
                if(arr[i] > second && arr[i] < first){
                    second = arr[i];
                }
            }
        }
        System.out.println(second);

//this question is solved for third largest element in an array using same pattern 
//for optimal solution we wiill take third as a variable
    }
}