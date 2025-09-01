class Solution {
    public boolean isCheck(StringBuilder str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            StringBuilder str = new StringBuilder(Integer.toString(n,i));
            System.out.println(str);
            if (!isCheck(str)) {
                return false;
            }
        }

        return true;
    }
}