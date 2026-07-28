class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,maxlen=0;
        int n=s.length();

        HashSet<Character> set = new HashSet<>();

        while(right<n){
            char c=s.charAt(right);//for Current Character

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,right-left+1);//Update Maximum Length
            right++;
        }
       return maxlen;
        
    }
}

    
