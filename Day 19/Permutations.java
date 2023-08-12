class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>() ;
        backtrack(new ArrayList<>(),al,nums) ;
        return al ;
    }

    public void backtrack(List<Integer>list ,List<List<Integer>>permutes,int []nums){
        if(list.size() == nums.length){
            permutes.add(new ArrayList<>(list)) ;
            return ;
        }
        for( int i = 0 ; i < nums.length ; i++ ){
            if(!list.contains(nums[i])){
                list.add(nums[i]) ;
                backtrack(list,permutes,nums) ;
                list.remove(list.size()-1) ;
            }
        }
    }
    
}