public boolean groupSumClump(int start, int[] nums, int target) {
  
  if(target == 0){
    return true ;
  }
  if(start == nums.length){
    return false ;
  }
  int i = 1 ;
  while(start < nums.length-1 && nums[start]==nums[start+1]){
    i++ ;
    start++ ;
  }
  boolean a = groupSumClump(start+1,nums,target-(nums[start]*i)) ;
  boolean b = groupSumClump(start+1,nums,target) ;
  
  return a||b ;
}
