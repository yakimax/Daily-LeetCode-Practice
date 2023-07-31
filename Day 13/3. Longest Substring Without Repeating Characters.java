import java.util.* ;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 ;
        int maxLength = 0 ;
        while(i<s.length()){
            HashMap<Character,Integer>hs = new HashMap<>() ;
            int count = 0 ;
            while(i<s.length()){
                if(hs.containsKey(s.charAt(i))){
                    i = hs.get(s.charAt(i)) + 1 ;
                    break ;
                }else{
                    hs.put(s.charAt(i),i) ;
                    count++ ;
                    maxLength = Math.max(maxLength,count) ;
                }
                i++ ;
            }
        }
        return maxLength ;
    }
}