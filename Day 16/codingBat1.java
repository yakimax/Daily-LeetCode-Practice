public boolean groupNoAdj(int start, int[] nums, int target) {
  if(target == 0){
    return true ;
  }
  if(nums.length <= start){
    return false ;
  }
    boolean a = groupNoAdj(start+2,nums,target-nums[start]) ;
    boolean b = groupNoAdj(start+1 ,nums,target) ;
    
    return a||b ;
}
