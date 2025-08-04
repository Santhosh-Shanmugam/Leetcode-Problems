class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i=0;i<arr1.length;i++)
        {
            int it = 0;
            for(int j=0;j<arr2.length;j++)
            {
                if(Math.abs(arr1[i]-arr2[j]) <= d)
                {
                    it = 0;
                    break;
                }
                else{
                    it = 1;
                }
            }
            if(it == 1) count++;
        }
        return count;
    }
}