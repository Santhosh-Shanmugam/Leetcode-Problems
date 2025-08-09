class Solution {
    public boolean isCheck(String str,String[] banned)
    {
        for(int i=0;i<banned.length;i++)
        {
            if(str.equals(banned[i])) return true;
        }
        return false;
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        String wholeStr = paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        String[] str = wholeStr.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str)
        {
            if(!s.isEmpty())map.put(s , map.getOrDefault(s , 0)+1);
        }
        int max = Integer.MIN_VALUE;
        String common = "";
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            String match = entry.getKey();
            if(!isCheck(match,banned))
            {
                if(entry.getValue() > max)
                {
                    max = entry.getValue();
                    common = entry.getKey();
                }
            }
        }
        return common;

    }
}