class Solution {
    public void reverseArrayWRTindices( int arr[] , int start , int end ){
        int i = start ;
        int j = end ;
        while( i < j ){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
        }
    }

    public void rotate(int[] arr, int k) {
        int n = arr.length ;
        k = k%n ;
        if(n==1 || k==n){
            return ;
        }
        reverseArrayWRTindices(arr,n-k,n-1) ;
        reverseArrayWRTindices(arr,0,n-k-1) ;
        reverseArrayWRTindices(arr,0,n-1) ;
    }
}