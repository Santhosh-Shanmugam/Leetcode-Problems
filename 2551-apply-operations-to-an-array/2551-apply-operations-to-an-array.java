class Solution {
    public int[] applyOperations(int[] nums) {
        int num[] = new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] = nums[i]*2;
                nums[++i] = 0; 
            }
        }
        int i=0;
        for(int n : nums)
        {
            if(n!=0) num[i++] = n;
        }
        while(i<nums.length)
        {
            num[i++] = 0;
        }
        return num;
    }
}