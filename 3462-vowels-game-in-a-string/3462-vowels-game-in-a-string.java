class Solution {
    public boolean isCheck(char c){ return "aeiou".contains(c+""); } 
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++) if(isCheck(s.charAt(i))) return true;
        return false;
    }
}