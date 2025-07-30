class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(Character.isDigit(c))
            {
                str.append(c);
            }else{
                if(str.length() > 0)
                {
                    while(str.length() > 1 && str.charAt(0) == '0')
                    {
                        str.deleteCharAt(0);
                    }
                    String s = String.valueOf(str);
                    set.add(s);
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            while (str.length() > 1 && str.charAt(0) == '0') {
                str.deleteCharAt(0);
            }
            set.add(str.toString());
        }
        System.out.println(set);
        return set.size();
    }
}