public class MoveZeroesToEnd{
    static void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int count=0;
        
        for(int i=0; i<n; i++){
            if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        
    }

    public static void main(String args[]){
        int arr[] = {1,0,65,2,0,5,0,0,2,3};
        pushZerosToEnd(arr);
        for( int n : arr){
            System.out.println(n);
        }
    }
}