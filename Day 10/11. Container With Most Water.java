class Solution {
    public int maxArea(int[] height) {
        int i = 0 ;
        int j = height.length -1 ;
        int volume = Integer.MIN_VALUE ;
        while ( i < j ){
            int currVolume = Math.min(height[i],height[j])*( j - i ) ;
            volume = Math.max(volume,currVolume);
            if(height[i] < height[j])i++ ;
            else j-- ;
        }
        return volume ;
    }
}