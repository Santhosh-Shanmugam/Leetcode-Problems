class Solution {
    public int triangularSum(int[] nums) {
        List<List<Integer>> sum = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int num : nums) arr.add(num);
        sum.add(arr);
        int i=1;
        while(sum.get(i-1).size() != 1)
        {
            List<Integer> tri = new ArrayList<>();
            int n = sum.get(i-1).size();
            List<Integer> prev = sum.get(i-1);
            for(int j=1;j<n;j++)
            {
                int parse = (prev.get(j-1)+prev.get(j)) % 10;
                tri.add(parse);
            }
            sum.add(tri);
            i++;
        }
        return sum.get(i-1).get(0);
    }
}