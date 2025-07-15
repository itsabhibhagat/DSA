public class RotateArrayBykElement{
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int k = 12;
        //naive approach
        //using O(n2)time complexity
        int n = arr.length;
        // for(int i=0; i < k; i++){
        //     int first=arr[0];
        //     for(int j=0; j<n-1;j++){
        //         arr[j]=arr[j+1];
        //     }
        //     arr[n-1]=first;
        // }


        // better solution using O(n) time and O(n) space
        // int[] temp = new int[n];
        // for(int i=0; i<n-k; i++){
        //     temp[i] = arr[k+i];
        // }
        // for(int i=0; i<k; i++){
        //     temp[n-k+i] = arr[i];
        // }
        // for(int i=0; i<n; i++){
        //     arr[i] = temp[i];
        // }


        //optimal approach that will work on O(n) time and O(1) space
        k = k % n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        for(int a:arr){
            System.out.println(a);
        }
    }
}