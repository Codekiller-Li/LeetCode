import java.util.LinkedList;
import java.util.Queue;

public class Test_226 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = new TreeNode(0);
        if(root==null){
            return null;
        }
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null){
            root.left=invertTree(root.left);
        }
        if(root.right!=null){
            root.right=invertTree(root.right);
        }
        return root;
    }
}
