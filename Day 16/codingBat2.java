public boolean groupSum6(int start, int[] nums, int target) {
  if(nums.length == start){
      if( target == 0 ){
        return true ; 
      }else{
        return false ;
      }
  }

  boolean a ;
  if(nums[start]==6){
    target-=6 ;
    a = groupSum6(start+1,nums,target) ;
  }else{
    a = groupSum6(start+1,nums,target-nums[start]) ;
  }
  boolean b = groupSum6(start+1,nums,target) ;
  
  return a||b ;
}
