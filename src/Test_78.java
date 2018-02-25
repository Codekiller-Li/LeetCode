import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums,0,list,res);
        return res;
    }
    private void dfs(int[] nums,int pos,List<Integer> list,List<List<Integer>> res){
        res.add(new ArrayList<Integer>(list));
        for(int i=pos;i<nums.length;i++){
            list.add(nums[i]);
            dfs(nums,i+1,list,res);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args){
        Test_78 test_78 = new Test_78();
        int[] test = new int[]{1,2,3};
        List<List<Integer>> result = test_78.subsets(test);
        for(List<Integer> i:result){
            System.out.println(Arrays.asList(i));
        }
    }
}
