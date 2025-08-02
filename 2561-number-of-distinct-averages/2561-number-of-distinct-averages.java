class Solution {
    public Float check(ArrayList<Integer> arr)
    {
        int n = Collections.max(arr);
        int m = Collections.min(arr);
        arr.remove(Integer.valueOf(n));
        arr.remove(Integer.valueOf(m));
        return (float)(n+m)/2;
    }
    public int distinctAverages(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : nums) arr.add(n);
        Set<Float> set = new HashSet<>();
        while(arr.size() > 1)
        {
            float val = check(arr);
            set.add(val);
        }
        return nums.length == 2 ? 1 : set.size();

    }
}