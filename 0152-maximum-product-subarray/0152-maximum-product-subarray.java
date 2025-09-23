class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = nums[0];
        int minprod = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxprod;
                maxprod = minprod;
                minprod = temp;
            }
            maxprod = Math.max(maxprod * nums[i], nums[i]);
            minprod = Math.min(minprod * nums[i], nums[i]);
            ans = Math.max(ans, maxprod);
        }

        return ans;
    }
}