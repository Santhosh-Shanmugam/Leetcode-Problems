class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal))
        {
            int[] freq = new int[26];
            for(char c : s.toCharArray())
            {
                freq[c - 'a']++;
                if(freq[c-'a'] > 1) return true;
            }
            return false;
        }
        int i = 0;
        int j = 0;
        int swap = 0;
        int first = -1;
        int sec = -1;
        while(i < s.length() && j < goal.length())
        {
            if(s.charAt(i) != goal.charAt(j))
            {
                swap++;
                if(first == -1) first = i;
                else if(sec == -1) sec = i;
            }
            i++;
            j++;
        }
        return swap == 2 && s.charAt(first) == goal.charAt(sec) 
                         && s.charAt(sec) == goal.charAt(first);
    }
}