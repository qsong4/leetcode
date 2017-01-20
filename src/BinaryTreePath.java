/**
 * Created by songqingyuan on 1/20/17.
 */
import java.util.*;
public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if(root!=null) help(root,"",answer);

        return answer;
    }
    public void help(TreeNode root, String path, List<String> answer){
        if(root.left==null&&root.right==null) answer.add(path+root.val);
        if(root.left!=null) help(root.left, path+root.val+"->", answer);
        if(root.right!=null) help(root.right, path+root.val+"->", answer);
    }
}
