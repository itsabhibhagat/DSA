public class ConsecutiveOnecount{
    static int maxConsecutiveCount(int[] arr) {
        // code here
        int n = arr.length;
        int maxcount = 0;
        int count = 1;
        if(n<2) return count; 
        for(int i = 0 ; i< n-1 ; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                count=1;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }

    public static void main(String args[]){
        int arr[] = { 1,1,0,0,1,0,1,0,1,1,1,1,1};

        int number = maxConsecutiveCount(arr);
        System.out.println(number);
        //time complexity is O(n) na sspace cpmplexity is O(1)
    }
}