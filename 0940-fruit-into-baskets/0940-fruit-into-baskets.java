class Solution {
    public int totalFruit(int[] fruits) {
        int j=0;
        int ans = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i], map.getOrDefault(fruits[i],0)+1);
            while(map.size() > 2)
            {
                map.put(fruits[j], map.get(fruits[j])-1);
                map.remove(fruits[j],0);
                j++;
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}