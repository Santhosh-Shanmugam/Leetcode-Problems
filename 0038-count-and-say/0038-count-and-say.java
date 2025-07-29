class Solution {
    public String countAndSay(int n) {
        int i = 1;
        String sb ="1";
        while(i<n){
            sb = convert(sb);
            i++;
        }
        return sb;
    }
    public String convert(String sb){
        String s ="";
        int count = 1;
        int left = 0;
        int right = 1;
        while(left <sb.length()){
            while(right<sb.length() && sb.charAt(left)==sb.charAt(right)){
                right++;
            
                count++;
            }
            s+=count+""+sb.charAt(left);
            left = right;
            right++;
            count = 1;
        }
        return s;
    }
}