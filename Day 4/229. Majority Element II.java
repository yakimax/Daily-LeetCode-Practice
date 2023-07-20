import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<>() ;
        int first = 0,second = 0,count1 = 0 ,count2 = 0 ;
        
        for( int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] == first){
                count1++ ;
            }else if(nums[i] == second){
                count2++ ;
            }else if(count1 == 0){
                first = nums[i] ;
                count1 = 1 ;
            }else if(count2 == 0){
                second = nums[i]  ;
                count2 = 1 ;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0 ;
        count2 = 0 ;
        int n = nums.length / 3  ;
        for( int i = 0 ; i < nums.length ; i++ ){
            if(nums[i]== first){
                count1++ ;
            }else if(nums[i]== second){
                count2++ ;
            }
        }
        if(count1 > n){
                list.add(first);
            }
            if(count2 > n){
                list.add(second);
            }
        return list ;
    }
}