class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++) prefix[i] = prefix[i-1]+nums[i];
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int leftsum = ((i>0) ? prefix[i-1] : 0);
            int rightsum = prefix[n-1] - prefix[i];

            int left = (i*nums[i]) - leftsum;
            int right = rightsum - (n-i-1) * nums[i];

            result[i] = left+right;
        }
        return result;
    }
}