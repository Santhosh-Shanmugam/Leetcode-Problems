class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            String str = "";
            int first = nums[i-1];
            int last = nums[i-1];
            while(i < nums.length && nums[i-1]+1 == nums[i])
            {
                last = nums[i];
                i++;
            }
            if(first != last)  str = String.valueOf(first+"->"+last);
            else str = String.valueOf(first);


            list.add(str);
        }
        return list;
    }
}