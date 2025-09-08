class Solution {
    public boolean check(int n)
    {
        String a = String.valueOf(n);
        if(a.contains("0"))
        {
            return false;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++)
        {
            int j = n-i;
            if(check(i) && check(j))
            {
                return new int[]{i,j};
            }
        }
        return null;
    }
}