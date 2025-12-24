/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> right = new ArrayList<>();
        rightside(root,right,0);
        return right;
    }
    public void rightside(TreeNode root,List<Integer> right,int depth)
    {
        if(root == null)    return;
        if(depth == right.size())
        {
            right.add(root.val);
        }
        rightside(root.right,right,depth+1);
        rightside(root.left,right,depth+1);
         
    }
}