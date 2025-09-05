class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        String[] temp = new String[strs.length];
        int i=0;
        for(String str : strs)
        {
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            temp[i++] = new String(chr);
        }
        for(int j=0;j<strs.length;j++)
        {
            String str = temp[j];
            if(map.containsKey(str))
            {
                map.get(str).add(strs[j]);
            }
            else{
                map.put(str, new ArrayList<>());
                map.get(str).add(strs[j]);
            }
        }

        res.addAll(map.values());
        return res;
    }
}