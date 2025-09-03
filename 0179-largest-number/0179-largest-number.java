class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++) arr.add(Integer.toString(nums[i]));
        Collections.sort(arr,(a,b)->(b+a).compareTo(a+b)); 
        if(arr.get(0).equals("0")) return "0";
        return String.join("",arr);
    }
}