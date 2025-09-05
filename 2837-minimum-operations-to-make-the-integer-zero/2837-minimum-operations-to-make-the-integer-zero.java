class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        long x = num1;
        int k=1;
        while(k<=60)
        {
            x -= num2;
            if(x < k) return -1;
            if(k >= Long.bitCount(x)) return k;

            k+=1;
        }
        return -1;
    }
}