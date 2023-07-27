class Solution {
    public int trap(int[] height) {
        int i = 0 ; 
        int j = height.length-1 ;
        int leftMax = 0 ;
        int rightMax = 0 ;
        int water = 0 ;
        while ( i <= j ){
            if( rightMax > leftMax ){
                leftMax = Math.max( height[i] , leftMax ) ;
                water += leftMax - height[i++] ;
            }else{
                rightMax = Math.max( height[j] , rightMax ) ;
                water += rightMax - height[j--] ;
            }
        }
        return water ;
    }
}