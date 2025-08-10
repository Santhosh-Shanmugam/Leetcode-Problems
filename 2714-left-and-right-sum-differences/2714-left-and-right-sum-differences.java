class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] dif = new int[nums.length];
        left[0] = 0;
        right[nums.length-1] = 0;
        int sum = 0;
        for(int i=1;i<nums.length;i++)
        {
            sum += nums[i-1];
            left[i] = sum;
        }
        sum = 0;
        for(int i=nums.length-2;i>=0;i--)
        {
            sum+=nums[i+1];
            right[i] = sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            dif[i] = Math.abs(right[i]-left[i]);
        }

        return dif;
    }
}