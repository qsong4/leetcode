/**
 * Created by songqingyuan on 2/13/17.
 */
import java.util.*;
public class findBottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        int result = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0;i<level;i++){
                TreeNode node = queue.poll();
                if(i==0){
                    result = node.val;
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }

        }
        return result;
    }
}
