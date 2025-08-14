class Solution {
    public String largestGoodInteger(String num) {
        int max = Integer.MIN_VALUE;
        if(num.length() == 3)
        {
            if(num.charAt(0) == num.charAt(1) && num.charAt(1) == num.charAt(2)) return num;
        }
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2))
            {
                String str = ""+num.charAt(i)+num.charAt(i+1)+num.charAt(i+2);
                max = Math.max(max, Integer.parseInt(str));
            }
        }
        return max < 0 ? "": (max == 0) ? "000" : String.valueOf(max);
    }
}