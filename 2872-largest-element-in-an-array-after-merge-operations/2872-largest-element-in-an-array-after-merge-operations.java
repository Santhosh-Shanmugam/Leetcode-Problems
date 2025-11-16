class Solution {
    public long maxArrayValue(int[] nums) {
        long maxNumber = nums[nums.length - 1];
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] > maxNumber)
            {
                maxNumber = nums[i];
            }
            else{
                maxNumber += nums[i];
            }
        }

        return maxNumber;
    }
}