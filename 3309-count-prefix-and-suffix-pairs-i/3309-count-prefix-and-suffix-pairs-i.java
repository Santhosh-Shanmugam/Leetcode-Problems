class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int i=0;
        int countPre = 0;
        while(i < words.length)
        {
            int j = i+1;
            while(j < words.length)
            {
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                {
                    countPre++;
                }
                j++;
            }
            i++;
        }
        return countPre;
    }
}