/**
 * Created by songqingyuan on 2/8/17.
 */
import java.util.*;
public class findFrequentTreeSum {
    Map<Integer, Integer> countSum;
    int maxCount=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        countSum = new HashMap<>();

        postOrder(root);

        List<Integer> res = new ArrayList<>();
        for (int key : countSum.keySet()) {
            if (countSum.get(key) == maxCount) {
                res.add(key);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    private int postOrder(TreeNode root){
        if(root==null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = root.val + left+ right;
        int count = countSum.getOrDefault(sum, 0) + 1;
        countSum.put(sum, count);
        maxCount = Math.max(maxCount, count);

        return sum;
    }
}
