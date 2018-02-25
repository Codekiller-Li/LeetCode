import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeKiller on 2017/12/17.
 */
public class Test_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int temp=0;
        for(int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1]=-1*Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(temp,i+1);
                temp++;
            }
        }
        return list;
    }

    public static void main(String[] args){
        Test_448 test_448 = new Test_448();
        int[] test = new int[]{10,2,5,10,9,1,1,4,3,7};
        List<Integer>list = new ArrayList<>();
        list=test_448.findDisappearedNumbers(test);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"||");
        }
    }
}
