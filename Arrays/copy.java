class Solution {
    static int repeatedSumOfDigits(int n) {
        // code here
        int sum =0;
        int digit =0;
        int carry =0;
        
        while(n > 0 || sum > 9){
            if(n ==0){
                n=sum;
                sum=0;
            }
            
            digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
}