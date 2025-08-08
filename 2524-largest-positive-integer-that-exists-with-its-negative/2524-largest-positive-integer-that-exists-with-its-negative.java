class Solution {
    public int findMaxK(int[] nums) {
        int i=0;
        int j;
        int max_elm = -1;
        for(i=0;i<nums.length-1;i++)
        {
            int num = nums[i];
            j = i+1;
            while(j<nums.length)
            {
                if(num == -nums[j])
                {
                    max_elm = Math.max(max_elm , Math.abs(num));
                }
                j++;
            }
        }
        return max_elm;
        
    }
}