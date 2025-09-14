class Solution {
    public int reverse(int x) {
        int rev;
        long sum=0;
        while(x!=0)
        {
            rev = x%10;
            x=x/10;
            sum = sum*10+rev;
            
            if(sum > Integer.MAX_VALUE  || sum < Integer.MIN_VALUE )
            {
                return 0;
            }
        }
        
        return (int)sum;
    }
}