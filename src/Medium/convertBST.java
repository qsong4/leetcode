package Medium;


/**
 * Created by songqingyuan on 5/7/17.
 */
public class convertBST {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;


        convertBST(root.right);

        root.val += sum;
        sum = root.val;

        convertBST(root.left);

        return root;

    }
}
