class Solution {
    public int findClosestNumber(int[] nums) {
        int close = nums[0];
        for(int n : nums)
        {
            if(Math.abs(n) < Math.abs(close)) close = n;
            else if(Math.abs(n) == Math.abs(close)) close = Math.max(close , n);
        }
        return close;
    }
}