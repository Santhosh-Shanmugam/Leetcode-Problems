class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        while(k<nums.length)
        {
            int temp = nums[k];
            nums[k] = nums[k+1];
            nums[k+1] = temp;

            k+=2;
        }
        return nums;
    }
}