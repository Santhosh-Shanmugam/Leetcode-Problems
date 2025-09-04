class Solution {
    public int count(String str)
    {
        char[] a = str.toCharArray();
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(char c : a)
        {
            if(vowels.contains(c+""))
            {
                count++;
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String first = s.substring(0,len/2);
        String two = s.substring(len/2,len);
        if(count(first) == count(two))
        {
            return true;
        }
        return false;
        
    }
}