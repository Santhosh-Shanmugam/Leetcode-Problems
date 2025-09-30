class Solution {
    public int triangularSum(int[] nums) {
        int size = nums.length;
        while(size > 1)
        {
            for(int i=1;i<size;i++)
            {
                nums[i-1] = (nums[i-1] + nums[i])%10;
            }
            size--;
        }
        return nums[0];
    }
}