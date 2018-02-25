import java.util.ArrayList;

public class Test_654 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    public TreeNode construct(int[] nums, int l, int r) {
        if (l == r)
            return null;
        int max_i = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, l, max_i);
        root.right = construct(nums, max_i + 1, r);
        return root;
    }
    public int max(int[] nums, int l, int r) {
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
    ArrayList<Integer> res = new ArrayList<Integer>();
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

        int[] test = new int[]{3,2,1,6,0,5};
        Test_654 test_654 = new Test_654();
        TreeNode root = test_654.constructMaximumBinaryTree(test);
        test_654.res=test_654.inorder(root);
        for(Integer i:test_654.res){
            System.out.println(i);
        }
    }

    public ArrayList<Integer> inorder(TreeNode root)
    {
        if (root == null)
        {
            return this.res;
        }
        inorder1(root);
        return this.res;
    }

    private void inorder1(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        inorder1(root.left);
        this.res.add(root.val);
        inorder1(root.right);
    }
}
