class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        int i=0,j=1;
        int[] num = new int[n/2];
        int index = 0;
        while(j<n)
        {
            if(index%2==0) num[index] = Math.min(nums[i],nums[j]);
            else num[index] = Math.max(nums[i],nums[j]);

            index++;
            i+=2;
            j+=2;
        }

        return n == 1 ? nums[0] : minMaxGame(num);
    }
}