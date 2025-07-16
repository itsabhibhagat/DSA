class LowerBound{
    public static void main(String[] args){
        int arr[] = {10,12,14,16,18,20};
        int x = 17;
        int n = arr.length;
        int start = 0; 
        int end = n-1;
        int ans = -1;

    // logic for lower bound in an array using binary search
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>=x){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        System.out.println(ans);
    }
}