class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int bal = 0;
        for(char c : s.toCharArray())
        {
            if(c == 'R') bal++;
            else bal--;
            if(bal == 0) ans++;
        }
        return ans;
    }
}