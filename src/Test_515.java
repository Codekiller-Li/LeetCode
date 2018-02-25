import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_515 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()){
            int cur=0;
            int curSize=Q.size();
            int max=-2147483648;
            while (cur<curSize){
                TreeNode temp = Q.poll();
                if(temp.val>=max){
                    max=temp.val;
                }
                cur++;
                if(temp.left!=null){
                    Q.add(temp.left);
                }
                if(temp.right!=null){
                    Q.add(temp.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}
