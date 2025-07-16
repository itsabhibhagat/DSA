class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0; 
        int end = n-1;
        int arr[] = new int[]{-1,-1};
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] >= target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            if(nums[mid] == target) arr[0] = mid;
        }
        start = 0;
        end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] <= target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            if(nums[mid] == target) arr[1] = mid;
        }
        return arr;
    }
}