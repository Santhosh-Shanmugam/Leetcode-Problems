class Solution {
    public int minOperations(String s) {
        char[] binary = s.toCharArray();
        int min_zero = 0;
        int min_one = 0;
        for(int i=0;i<binary.length;i++)
        {
            char expected1 = (i%2==0) ? '0' : '1';
            char expected2 = (i%2==0) ? '1' : '0';

            if(binary[i] != expected1) min_zero++;
            if(binary[i] != expected2) min_one++;

        }

        return Math.min(min_zero,min_one);
    }
}