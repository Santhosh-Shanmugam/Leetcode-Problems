class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            int digit = n;
            int sum =0;
            while(digit!=0)
            {
                sum += Math.pow(digit%10,2);
                digit/=10;
            }
            n = sum;
        }
        return n == 1;
    }
}