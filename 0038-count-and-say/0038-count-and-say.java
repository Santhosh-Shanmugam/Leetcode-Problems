class Solution {
    public String countAndSay(int n) {
        String count = "1";
        int i = 1;
        while(i<n)
        {
            count = convert(count);
            i++;
        }
        return count;
    }
    public String convert(String s)
    {
        String str = "";
        int left = 0;
        int right = 1;
        int c = 1;
        while(left < s.length())
        {
            while(right < s.length() && s.charAt(left) == s.charAt(right))
            {
                right++;
                c++;
            }
            str += ""+c+s.charAt(left);
            left = right;
            right++;
            c = 1;
        }

        return str;
    }
}