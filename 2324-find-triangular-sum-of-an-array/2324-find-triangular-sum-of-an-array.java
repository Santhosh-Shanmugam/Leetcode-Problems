class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> sum = new ArrayList<>();
        for(int n : nums) sum.add(n);

        while(sum.size() > 1)
        {
            List<Integer> arr = new ArrayList<>();
            for(int i=1;i<sum.size();i++)
            {
                int parse = (sum.get(i-1)+sum.get(i))%10;
                arr.add(parse);
            }
            sum = arr;
        }
        return sum.get(0);
    }
}