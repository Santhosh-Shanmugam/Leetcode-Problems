class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primes = 0;
        Set<Integer> set = Set.of(2,3,5,7,11,13,17,19,23,29,31,37);
        for(int i=left;i<=right;i++)
        {
            if(set.contains(Integer.bitCount(i)))
            {
                primes++;
            }
        }
        return primes;
    }
}
