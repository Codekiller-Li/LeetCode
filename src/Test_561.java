import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_561 {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        int double_n=nums.length;
        nums=shellSort(nums);
        for(int i=0;i<double_n;i=i+2){
            sum=sum+nums[i];
        }
        return sum;
    }
    private int[] shellSort(int[] array){
        int temp=0;
        int k=0;
        int d=array.length;
        if(array.length > 0){
            while (d!=0){
                d=d/2;
                for(int i=0;i<d;i++){
                    for(int j=i+d;j<array.length;j+=d){
                        k=j-d;
                        temp=array[j];
                        while (k>=0 && temp<array[k]){
                            array[k+d]=array[k];
                            k-=d;
                        }
                        array[k+d]=temp;
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        Test_561 test_561 = new Test_561();
        int sum=0;
        int[] test = new int[]{9,87,63,78,23,87,62,78,236,12,65,89};
        sum=test_561.arrayPairSum(test);
        System.out.println(sum);

        test=test_561.shellSort(test);
        System.out.println(Arrays.toString(test));
    }
}