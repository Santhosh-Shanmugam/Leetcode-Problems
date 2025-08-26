class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = -1;
        int maxArea = -1;
        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            double diagonal = Math.sqrt((long)length * length + (long)width * width);
            int area = length * width;

            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        return maxArea;
    }
}