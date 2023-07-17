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

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }

    //write inorder traversal code 
        public void inorder(TreeNode root, ArrayList<Integer> res){
         if(root == null){
             return;
         }
         inorder(root.left, res);
         res.add(root.val);
         inorder(root.right, res);
    }
    
}