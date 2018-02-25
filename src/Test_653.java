import java.util.ArrayList;
import java.util.List;

public class Test_653 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        orderTravel(root,list);
        if(list.size()<2){
            return false;
        }else {
            if(list.get(0)+list.get(1)>k||list.get(list.size()-2)+list.get(list.size()-1)<k){
                return false;
            }else {
                for(int i=0;i<list.size()-1;i++){
                    for(int j=i+1;j<list.size();j++){
                        if(list.get(i)+list.get(j)==k){
                            return true;
                        }
                    }
                }
                return false;
            }
        }
    }
    private void orderTravel(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        orderTravel(root.left,list);
        list.add(root.val);
        orderTravel(root.right,list);
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        Test_653 test_653 = new Test_653();
        Boolean test = test_653.findTarget(treeNode1,3);
    }
}
