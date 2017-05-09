package Medium;
import java.util.*;

/**
 * Created by songqingyuan on 5/9/17.
 */
public class InorderTra {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<Integer>();

        helper(root, res);

        return res;
    }

    public void helper(TreeNode node, List<Integer> res){

        if(node!=null){

            helper(node.left, res);
            res.add(node.val);
            helper(node.right, res);

        }
    }
}
