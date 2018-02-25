import java.util.ArrayList;
import java.util.List;

public class Test_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int currNum = Math.abs(nums[i]);
            if(nums[currNum - 1] > 0) {
                nums[currNum - 1] = -nums[currNum - 1];
            }else {
                result.add(currNum);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Test_442 test_442 = new Test_442();
        int[] test= new int[]{10,2,5,10,9,1,1,4,3,7};
        for(Integer i:test_442.findDuplicates(test)){
            System.out.println(i);
        }
    }
}
