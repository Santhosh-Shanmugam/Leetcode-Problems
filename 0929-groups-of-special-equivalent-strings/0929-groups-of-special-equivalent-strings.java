class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> seen = new HashSet<>();
        for(String str : words)
        {
            String even = "";
            String odd = "";

            for(int i=0;i<str.length();i++)
            {
                if(i%2==0)
                {
                    even += str.charAt(i)+"";
                }else{
                    odd += str.charAt(i)+"";
                }
            }

            char[] evenc = even.toCharArray();
            Arrays.sort(evenc);
            char[] oddc = odd.toCharArray();
            Arrays.sort(oddc);

            seen.add(new String(evenc)+"|"+new String(oddc));
        }

        return seen.size();
    }
}