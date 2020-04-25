/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 * };
 */
public class DiameterOfTree {

	 	int ans;
	    public int diameterOfBinaryTree(TreeNode root) {
	        ans = 0;
	        depth(root);
	        return ans;
	    }
	    public int depth(TreeNode node) {
	        if (node == null) return 0;
	        int L = depth(node.left);
	        int R = depth(node.right);
	        ans = Math.max(ans, L+R);
	        return Math.max(L, R) + 1;
	    }
}
