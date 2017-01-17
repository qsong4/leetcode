/**
 * Created by songqingyuan on 1/16/17.
 */
import java.util.*;
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;
        queue.offer(root);


        while(!queue.isEmpty()){
            List<Integer> tem = new ArrayList();
            int level = queue.size();

            for(int i=0;i<level;i++){
                TreeNode n = queue.poll();
                if(n.left!=null) queue.offer(n.left);
                if(n.right!=null) queue.offer(n.right);

                tem.add(n.val);
            }
            result.add(tem);
        }
        return result;
    }
}
