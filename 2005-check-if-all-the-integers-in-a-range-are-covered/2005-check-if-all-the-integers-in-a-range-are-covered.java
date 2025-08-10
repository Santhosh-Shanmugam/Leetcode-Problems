class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] arr = new boolean[51];
        for(int[] a : ranges)
        {
            for(int i=a[0];i<=a[1];i++)
            {
                arr[i] = true;
            }
        }

        for(int i=left;i<=right;i++)
        {
            if(!arr[i]) return false;
        }
        return true;

    }
}