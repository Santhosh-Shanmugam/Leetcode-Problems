class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> valid = new HashSet<>(Arrays.asList(dis(p1,p2) , dis(p1,p3) , dis(p1,p4), dis(p2,p3) , dis(p2,p4), dis(p3,p4)));
        return !valid.contains(0) && valid.size() == 2;
    }
    public int dis(int[] arr1 , int[] arr2)
    {
        return (int)(Math.pow(arr1[0]-arr2[0],2) + Math.pow(arr1[1]-arr2[1], 2));
    }
}