/**
 * Created by songqingyuan on 1/15/17.
 */
import java.util.*;

public class BTlevelOrder {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        if(root == null) return result;
        while(!queue.isEmpty()){
            List<Integer> tt = new ArrayList<Integer>();

            int level = queue.size();


            for(int i=0;i<level;i++){

                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                tt.add(queue.poll().val);

            }
            result.add(0,tt);
        }

        return result;

    }
}
