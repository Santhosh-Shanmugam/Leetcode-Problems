class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(gain[0]);
        int max = Math.max(arr.get(0),arr.get(1));
        for(int i=1;i<gain.length;i++)
        {
            arr.add(arr.get(i)+gain[i]);
            max = Math.max(max, arr.get(i));
        }
        max = Math.max(max, arr.get(n-1)+gain[n-1]);
        return max;
    }
}