/**
 * Created by songqingyuan on 11/7/16.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    int maxDepth(TreeNode node, int depth){
        if (node == null) return depth;
        else
            return Math.max(maxDepth(node.left, depth+1),maxDepth(node.right, depth+1));
    }


}
