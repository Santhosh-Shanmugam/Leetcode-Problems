class Solution {
    public boolean isCheck(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int vowelmax = 0;
        int consonantmax = 0;
        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
            if(isCheck(c)) vowelmax = Math.max(vowelmax,freq[c-'a']);
            else consonantmax = Math.max(consonantmax , freq[c-'a']);
        }

        return vowelmax+consonantmax;
    }
}