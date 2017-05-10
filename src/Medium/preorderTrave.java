package Medium;
import java.util.*;
/**
 * Created by songqingyuan on 5/10/17.
 */
public class preorderTrave {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            if(node!=null){
                res.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return res;
    }
}
