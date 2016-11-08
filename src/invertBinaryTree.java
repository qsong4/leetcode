/**
 * Created by songqingyuan on 11/8/16.
 */

public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root!=null){
            TreeNode tem = root.left;
            root.left = root.right;
            root.right = tem;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;

    }
}
