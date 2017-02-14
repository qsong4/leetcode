/**
 * Created by songqingyuan on 2/13/17.
 */
import java.util.*;
public class largestValue {
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            int max_value = Integer.MIN_VALUE;
            for(int i=0;i<level;i++){
                TreeNode node = queue.poll();
                if(node.val>max_value){
                    max_value = node.val;
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            result.add(max_value);
        }
        return result;
    }
}
