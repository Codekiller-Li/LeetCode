import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_length=0;
        int temp=0;
        if(nums.length==0){
            return 0;
        }else {
            if(nums[0]==1){
                temp=1;
                max_length=1;
            }else {
                temp=0;
                max_length=0;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1){
                if(nums[i-1]==1){
                    temp++;
                    if(temp>max_length){
                        max_length=temp;
                    }
                }else {
                    temp=1;
                    if(temp>max_length){
                        max_length=temp;
                    }
                }
            }
        }
        return max_length;
    }
    private List<Integer> int2int_arr(int n){
        List<Integer> num = new ArrayList<>();
        int temp=0;
        while (n>1){
            num.add(temp,n%2);
            n= (int) Math.floor(n/2);
            temp++;
        }
        num.add(temp,n);
        return num;
    }
}
