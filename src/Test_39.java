import java.util.ArrayList;
import java.util.List;

public class Test_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combination(candidates, target, 0);
    }

    public List<List<Integer>> combination(int[] candidates, int target, int index){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = index; i < candidates.length; i++){
            List<Integer> list = new ArrayList<Integer>();
            int temp = candidates[i];
            while(temp <= target){
                list.add(candidates[i]);
                if(temp == target){
                    result.add(list);
                    break;
                }
                List<List<Integer>> tempResult = combination(candidates, target - temp, i + 1);
                for(List<Integer> res : tempResult){
                    res.addAll(list);
                    result.add(res);
                }
                temp += candidates[i];
            }
        }
        return result;
    }
    public static void main(String[] args){
        Test_39 test_39 = new Test_39();
        int[] test = new int[]{2,3,6,7};
        List<List<Integer>> list = test_39.combinationSum(test,7);
        for(List<Integer> i:list){
            System.out.println(i.toString());
        }
    }
}
