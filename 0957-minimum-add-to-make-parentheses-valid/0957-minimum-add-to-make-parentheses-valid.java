class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int isbal = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(') balance++;
            else {
                if(balance > 0)
                {
                    balance--;
                }
                else{
                    isbal++;
                }
            }
        }
        return Math.abs(balance+isbal);
    }
}