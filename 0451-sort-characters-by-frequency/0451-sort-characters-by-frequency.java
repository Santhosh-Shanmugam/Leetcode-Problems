class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        ArrayList<Character> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, (a,b)-> map.get(b)-map.get(a));
        StringBuilder str = new StringBuilder();
        for(char c : arr)
        {
            int count = map.get(c);
            for(int i=0;i<count;i++)
            {
                str.append(c);
            }
        }

        return str.toString();
    }
}