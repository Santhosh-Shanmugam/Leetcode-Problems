class Solution {
    public boolean pow(int n)
    {
        while(n%3==0) n/=3;
        return n==1;
    }
    public boolean isPowerOfThree(int n) {
        return n<=0 ? false : pow(n);
    }
}