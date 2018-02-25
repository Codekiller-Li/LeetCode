import java.util.ArrayList;
import java.util.List;

public class Test_26 {
    public int removeDuplicates(int[] nums) {
            if (nums == null) return 0;
            int res = 0;
            int[] p = nums;
            for (int i = 1; i < nums.length; i++) {
                if (p[i] == nums[res]) {

                } else {
                    nums[++res] = p[i];
                }
            }
            return res + 1;
    }
    public static void main(String[] args){
        Test_26 test_26= new Test_26();
        int[] test = new int[]{1,3,6,6,8,6,9,7,6};
        int length=0;
        length=test_26.removeDuplicates(test);
        System.out.println(length);
//        for(int i=0;i<test.length;i++){
//            System.out.println(test[i]);
//        }
    }
}
