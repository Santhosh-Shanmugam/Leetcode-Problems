class Solution {
    public boolean isValid(String row,String word)
    {
        for(char c : word.toLowerCase().toCharArray())
        {
            if(!row.contains(c+"")) return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
        String[] rows = { "qwertyuiop" , "asdfghjkl" , "zxcvbnm"};
        ArrayList<String> arr = new ArrayList<>();
        for(String word : words)
        {
            for(String row : rows)
            {
                if(isValid(row,word))
                {
                    arr.add(word);
                }
            }
        }
        return arr.toArray(new String[0]);
    }
}