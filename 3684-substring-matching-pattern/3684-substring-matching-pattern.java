class Solution {
    public boolean hasMatch(String s, String p) {
        int idx = p.indexOf("*");
        int first = s.indexOf(p.substring(0,idx));
        int two = s.indexOf(p.substring(idx+1) , first+idx);
        return first!=-1 && two!=-1;
    }
}