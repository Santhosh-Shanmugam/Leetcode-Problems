class Solution {
    public int roblinear(int[] nums,int n,int m)
    {
        int len = m-n+1;
        if(len == 1) return nums[n];
        int[] dp = new int[len];
        dp[0] = nums[n];
        dp[1] = Math.max(nums[n],nums[n+1]);
        for(int i=2;i<len;i++)
        {
            dp[i] = Math.max(dp[i-1],nums[n+i]+dp[i-2]);
        }
        return dp[len-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);

        return Math.max(roblinear(nums,0,n-2),roblinear(nums,1,n-1));
    }
}