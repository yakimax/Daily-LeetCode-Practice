public boolean splitArray(int[] nums) {
    return helper(nums,0,0,0) ;
  }
  
  public boolean helper(int []nums ,int i , int sum1 , int  sum2 ){
    
    if(i==nums.length){
      return sum1 == sum2 ? true : false ;
    }
    
    boolean a = helper(nums,i+1,sum1+nums[i],sum2) ;
    boolean b = helper(nums,i+1,sum1,sum2+nums[i]) ; 

    return a||b ;  
}