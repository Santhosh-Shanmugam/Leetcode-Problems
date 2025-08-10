class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int len = j-i+1;
                if(len%2!=0)
                {
                    for(int k=i;k<=j;k++)
                    {
                        sum+=arr[k];
                    }
                }
            }
        }
        return sum;
    }
}