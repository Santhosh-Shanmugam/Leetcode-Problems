class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for(char c : s.toCharArray()) if("aeiouAEIOU".contains(c+"")) arr.add(c);
        Collections.sort(arr);
        char[] sort = s.toCharArray();
        int j=0;
        for(int i=0;i<sort.length;i++)
        {
            if("aeiouAEIOU".contains(sort[i]+""))
            {
                sort[i] = arr.get(j++);
            }
        }
        return new String(sort);
    }
}