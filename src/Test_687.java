import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Test_687 {
    //对每一个节点求左右最大路径的和，求其中的max
//    public static Map<String,Integer> map = new HashMap<>();
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    public int longestUnivaluePath(TreeNode root) {
//        orderTravel(root,0);
//        return 0;
//    }
//
//    private void orderTravel(TreeNode root,int n) {
//        if (root==null){
//            return;
//        }
//        orderTravel(root.left,n);
//        int key=0;
//        for (Map.Entry<String, Integer> entry:map.entrySet()) {
//            if(Objects.equals(entry.getKey(), root.val + "")&&(root.val==n||n==0)){
//                int temp=entry.getValue();
//                map.put(entry.getKey(),temp+1);
//                key=1;
//                n=root.val;
//                break;
//            }
//        }
//        if(key==1){
//
//        }else {
//            map.put(root.val+"",1);
//            key=0;
//            n=root.val;
//        }
//        orderTravel(root.right,n);
//    }
//
    public static void main(String[] args){
        Test_687 test_687 = new Test_687();
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        int test=test_687.longestUnivaluePath(treeNode1);
        System.out.println(test);
    }
//    private int re = 0;
//    public int longestUnivaluePath(TreeNode root) {
//        help(root, 0);
//        return re;
//    }
//
//    public int help(TreeNode root, int n) {
//        if (root == null)
//            return 0;
//        int left = help(root.left, root.val);
//        int right = help(root.right, root.val);
//        re = Math.max(re, left + right);
//        return root.val == n ? Math.max(left, right) + 1 : 0;
//    }

    public int longestUnivaluePath(TreeNode root){
        if(root==null){
            return 0;
        }
        int max=0;
        max=dfs(root,max);
        return max;
    }
    private int dfs(TreeNode root,int max){
        int l=0,r=0;
        if(root.left!=null && root.left.val==root.val){
            l=1+dfs(root.left,max);
        }else if(root.left!=null){
            dfs(root.left,max);
        }else {

        }

        if(root.right!=null && root.right.val==root.val){
            r=1+dfs(root.right,max);
        }else if(root.right!=null){
            dfs(root.right,max);
        }else {

        }

        if(l+r>max){
            max=l+r;
            return max;
        }else {
            return max;
        }
    }
}
