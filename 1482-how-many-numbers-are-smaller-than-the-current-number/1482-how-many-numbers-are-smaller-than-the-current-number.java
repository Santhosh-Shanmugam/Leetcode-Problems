class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq= new int[101];
        for(int n : nums){
            freq[n]++;
        }

        for(int i=1;i<101;i++)
        {
            freq[i] += freq[i-1];
        }
        int count[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]== 0)
            {
                count[i] = 0;
            }
            else{
                count[i] = freq[nums[i] - 1];
            }
        }

        return count;
    }
}