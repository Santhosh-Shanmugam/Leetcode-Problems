class Solution {
    public String largestGoodInteger(String num) {
        char c = 0;
        for(int i=0;i<num.length()-2;i++)
        {
            char a = num.charAt(i);
            if(a == num.charAt(i+1) && a == num.charAt(i+2))
            {
                if(a > c)
                {
                   c = a;
                }
            }
        }
        return (c == 0) ? "" : ""+c+c+c;
    }
}