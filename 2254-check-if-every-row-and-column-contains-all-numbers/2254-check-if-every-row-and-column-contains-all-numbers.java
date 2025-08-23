class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            HashSet<Integer> set1 = new HashSet<>();
            for(int j=0;j<matrix[0].length;j++)
            {
                set1.add(matrix[i][j]);
            }
            if(set1.size() != matrix[0].length) return false;
        }

        for(int i=0;i<matrix.length;i++)
        {
            HashSet<Integer> set1 = new HashSet<>();
            for(int j=0;j<matrix[0].length;j++)
            {
                set1.add(matrix[j][i]);
            }
            if(set1.size() != matrix[0].length) return false;
        }

        return true;
    }
}