class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums) freq.put(num , freq.getOrDefault(num,0)+1);
        int val = 0;
        int key = 0;
        int max = Integer.MIN_VALUE;
        for(int entry : freq.values())
        {
            max = Math.max(max,entry);
        }
        for(int entry : freq.values())
        {
            if(max == entry) val += entry;
        }
        return val;
    }
}