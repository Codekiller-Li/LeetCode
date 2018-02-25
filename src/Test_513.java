import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_513 {
    public static int TAG=0;
    private List<TreeNode> list = new ArrayList<>();
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> Q = new LinkedList<>();
        int result=0;
        Q.add(root);
        while (!Q.isEmpty()){
            int cur=0;
            int curSize=Q.size();
            while (cur<curSize){
                TreeNode temp = Q.poll();
                if(cur==0){
                    result=temp.val;
                }
                cur++;
                if(temp.left!=null){
                    Q.add(temp.left);
                }
                if(temp.right!=null){
                    Q.add(temp.right);
                }
            }
        }
        return result;
    }
}
