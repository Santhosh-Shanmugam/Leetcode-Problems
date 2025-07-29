class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int n = chars.length;
        for(int i=0;i<n;i++)
        {
            char c=chars[i];
            int count = 0;

            while(i<n && c == chars[i])
            {
                count++;
                i++;
            }

            if(count == 1) chars[idx++] = c;
            else{
                chars[idx++] = c;
                String digit = String.valueOf(count);
                for(char ch : digit.toCharArray())
                {
                    chars[idx++] = ch;
                }
            }
            i--;
        }
        return idx;
    }
}