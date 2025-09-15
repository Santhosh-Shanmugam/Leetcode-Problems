class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        for(String word : text.split(" "))
        {
            boolean val = true;
            for(char c : brokenLetters.toCharArray())
            {
                if(word.contains(c+""))
                {
                    val = false;
                    break;
                }
            }
            if(val) count++;
        }
        return count;
    }
}