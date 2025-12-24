class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i=0;i<apple.length;i++) sum += apple[i];
        List<Integer> Capacity = new ArrayList<>();
        for(int num : capacity) Capacity.add(num);
        Capacity.sort((a,b) -> b-a);
        int res = 0;
        while(sum > 0)
        {
            sum -= Capacity.get(res);
            res += 1;
        }
        return res;
    }
}