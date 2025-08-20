class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder str = new StringBuilder();
        int ones = 0;
        int zeros = 0;
        for(char c : s.toCharArray())
        {
            if(c == '0') zeros++;
            else ones++;
        }
        for(int i=0;i<ones-1;i++)   str.append("1");
        for(int i=0;i<zeros;i++)    str.append("0");
        str.append("1");
        return str.toString();
    }
}