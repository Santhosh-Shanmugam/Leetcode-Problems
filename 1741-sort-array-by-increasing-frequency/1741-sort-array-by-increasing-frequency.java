class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr,(a,b)->{
            int freqCompare = map.get(a) - map.get(b);
            if (freqCompare == 0) {
                return b - a; // value descending
            }
            return freqCompare;
        });
        int k=0;
        for(int i : arr)
        {
            int count = map.get(i);
            for(int j=0;j<count;j++)
            {
                nums[k++] = i;
            }
        }

        return nums;
    }
}