class Solution {
    public int longestBeautifulSubstring(String word) {
        int l = 0;
        int r = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(r < word.length())
        {
            if(r>0 && word.charAt(r) < word.charAt(r-1))
            {
                l = r;
                set.clear();
            }
            set.add(word.charAt(r));
            if(set.size() == 5)
            {
                max = Math.max(max, r-l+1);
            }
            r++;
        }
        return max;
    }
}