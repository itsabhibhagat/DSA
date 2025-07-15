import java.util.Arrays;
public class MaxtripletProduct{
    
    public static void main(String args[]){
        int arr[] = {10,3,5,6,20,12};

        //naive approach using three loops
        //time complexity -> O(n3)
        //space complexity -> O(1)
        // int n = arr.length;
        // int maximum = Integer.MIN_VALUE;
        // for(int i=0; i <n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k = j+1; k<n; k++){
        //             maximum = Math.max(maximum,arr[i]*arr[j]*arr[k]);
        //         }            
        //     }
        // }
        // System.out.println(maximum);

        //-----------------------------------------------------------------------------------


        //better solution like max of last 3 lelemnt and 
        //first two and last one element
        //time complexity = O(nlog(n)) space complexity = O(1)
        // int n = arr.length;
        // Arrays.sort(arr);

        // int maximum =  Math.max(arr[n-1]*arr[n-2]*arr[n-3], arr[0]*arr[1]*arr[n-1]);
        // System.out.println(maximum);

        //---------------------------------------------------------------------------------------------

        //optimal solution using sinle loop
        //time complexity = O(n) space conmplexity = O(1)

        int n = arr.length;
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        // int minC = Integer.MAX_VALUE;

        for(int i=0; i<n ; i++){
            if(arr[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }
            else if(arr[i] > maxB){
                maxC = maxB;
                maxB = arr[i];
            }
            else if(arr[i] > maxC){
                maxC = arr[i];
            }

            if(arr[i] < minA){
                minB = minA;
                minA = arr[i];
            }
            else if(arr[i] < minB){
                minB = arr[i];
            }        
        }

        int maximum = Math.max(minA*minB*maxA,maxA*maxB*maxC);
        System.out.println(maximum);
    }

    // Consider the array: [-10, -10, 1, 3, 2]
    //   Top three max values: 3, 2, 1 → Product = 3 × 2 × 1 = 6
    //   Two min values: -10, -10 and max: 3 → Product = -10 × -10 × 3 = 300
    // The second case gives a much larger result!

}