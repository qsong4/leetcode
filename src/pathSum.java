/**
 * Created by songqingyuan on 1/14/17.
 */

public class pathSum {
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        return helper(root, sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    private int helper(TreeNode root, int sum) {

        if(root==null){
            return 0;
        }

        return (root.val==sum? 1:0) + helper(root.left, sum-root.val)+helper(root.right, sum-root.val);
    }
}
