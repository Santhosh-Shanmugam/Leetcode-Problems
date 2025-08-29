class Solution {
    public int longestPalindrome(String s) {
        int len = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c))
            {
                set.remove(c);
                len += 2;
            }
            else{
                set.add(c);
            }
        }

        return !set.isEmpty() ? len+1 : len;
    }
}