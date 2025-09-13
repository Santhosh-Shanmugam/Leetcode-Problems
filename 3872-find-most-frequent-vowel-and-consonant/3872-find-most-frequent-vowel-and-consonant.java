class Solution {
    public boolean isCheck(char c){
        return "aeiou".contains(c+"");
    }
    public int isSum(HashMap<Character,Integer> map)
    {
        int max = 0;
        for(char c : map.keySet())
        {
            max = Math.max(max, map.get(c));
        }
        return max;
    }
    public int maxFreqSum(String s) {
        char[] alpha = s.toCharArray();
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> consonants = new HashMap<>();
        for(char c : alpha)
        {
            if(isCheck(c))
            {
                vowel.put(c,vowel.getOrDefault(c,0)+1);
            }
            else{
                consonants.put(c,consonants.getOrDefault(c,0)+1);
            }
        }
        int mostfreq = isSum(vowel) + isSum(consonants);

        return mostfreq;
    }
}