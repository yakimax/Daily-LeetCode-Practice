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

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }
        
        return maxLength;
    }
}