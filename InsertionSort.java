class InsertionSort{
    public static void main(String[] args) {
        
        int arr[] = {5,4,3,2,1};
        int n = arr.length;

        for(int i=0;i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int a : arr){
            System.out.println(a + " ");
        }
        
    }
}