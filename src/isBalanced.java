/**
 * Created by songqingyuan on 1/17/17.
 */
public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = depth(root.left);
        int right = depth(root.right);

        return Math.abs(left-right)<2 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int depth(TreeNode t){
        if(t==null) return 0;
        return Math.max(depth(t.right), depth(t.left))+1;
    }
}
