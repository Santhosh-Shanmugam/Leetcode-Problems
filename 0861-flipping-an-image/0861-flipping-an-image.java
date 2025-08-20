class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                image[i][j] = (image[i][j] == 1) ? 0 : 1;
            }
        }
        
        for(int[] row:image)
        {
            for(int i=0,j=row.length-1;i < j ;i++,j--)
            {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
        return image;
        
    }
}