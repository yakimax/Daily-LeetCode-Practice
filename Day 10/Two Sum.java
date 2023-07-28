class Solution {
    boolean hasArrayTwoCandidates(int nums[], int n, int x) {
        // code here
        HashSet<Integer>hm = new HashSet<>() ;
        for( int i = 0 ; i < n ; i++){
            if(hm.contains(x-nums[i])){
                return true ;
            }else{
                hm.add(nums[i]) ;
            }
        }
        return false ;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>() ;
        for( int i = 0 ; i < nums.length ; i++ ){
            if(hm.containsKey( target - nums[i] )){
                return new int[]{i,hm.get(target-nums[i])} ;
            }else{
                hm.put(nums[i],i) ;
            }
        }
        return new int[]{} ;
    }
}

// time complexity == o(N) ;
// space complexity == o(N) ;