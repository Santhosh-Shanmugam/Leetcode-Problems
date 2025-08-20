class Solution {
    public boolean Checker(char a,char b)
    {
        int n = a-'0';
        int m = b-'0';
        return (n%2==0 && m%2==0) || (n%2!=0 && m%2!=0);
    }
    public String getSmallestString(String s) {
        char[] c = s.toCharArray();
        for(int i=0;i<c.length-1;i++)
        {
            if(Checker(c[i],c[i+1]) && c[i] > c[i+1])
            {
                char temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
                break;
            }
        }
        String str = String.valueOf(c);
        return str;
    }
}