class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        int left = 0;
        int right = nums.length-1;
        while(left < right)
        {
            if(-nums[left] == nums[right])
            {
                max = Math.max(max , Math.abs(nums[right]));
                left++;
                right--;
            }
            else if(-nums[left] > nums[right]) left++;
            else right--;
        }
        return max;
    }
}