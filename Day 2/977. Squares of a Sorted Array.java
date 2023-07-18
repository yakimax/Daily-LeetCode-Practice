class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i = 0 ;
        int j = nums.length - 1 ; 
        int k = j ;
        int arr[] = new int[j+1] ;

        while( i <= j ){
            if( Math.abs(nums[i]) > Math.abs(nums[j]) ){
                arr[k--] = nums[i] * nums[i] ;
                i++ ;
            }else{
                arr[k--] = nums[j] * nums[j] ;
                j-- ;
            }
        }

        return arr ;
    }
}