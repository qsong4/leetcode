/**
 * Created by songqingyuan on 11/9/16.
 */
public class sumOfLeft {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }
    public int sumOfLeftLeaves(TreeNode root, boolean flag) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null && flag){
            return root.val;
        }

        return sumOfLeftLeaves(root.right, false) + sumOfLeftLeaves(root.left, true);
    }

    public static void main(String[] args){

    }
}
