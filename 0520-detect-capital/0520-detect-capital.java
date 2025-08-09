class Solution {
    public boolean detectCapitalUse(String word) {
        int all = 0;
        int small = 0;
        for(char c:word.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                all++;
            }else{
                small++;
            }
        }
        if(all == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return all == word.length() || small == word.length();
    }
}