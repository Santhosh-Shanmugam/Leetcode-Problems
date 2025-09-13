class Solution {
    private boolean check(int num)
    {
        int temp = num;
        int rem=0;
        while(num>0)
        {
            rem = num % 10;
            if(rem==0) return false;
            if(temp%rem!=0) return false;
            num /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(check(i)) list.add(i);
        }
        return list;
    }
}