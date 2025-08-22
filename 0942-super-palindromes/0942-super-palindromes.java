class Solution {
    public boolean isChecker(long num)
    {
        if(num <= 9) return true;
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
    public int superpalindromesInRange(String left, String right) {
        long L = Long.parseLong(left);
        long R = Long.parseLong(right);
        int count = 0;
        for (int k = 1; k < 100000; k++) {
            String s = String.valueOf(k);
            String rs = new StringBuilder(s).reverse().toString();

            String odd = s + rs.substring(1);
            long num1 = Long.parseLong(odd);
            long sq1 = num1 * num1;
            if (sq1 >= L && sq1 <= R && isChecker(sq1)) {
                count++;
            }

            String even = s + rs;
            long num2 = Long.parseLong(even);
            long sq2 = num2 * num2;
            if (sq2 >= L && sq2 <= R && isChecker(sq2)) {
                count++;
            }
        }
        return count;
    }
}