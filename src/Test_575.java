import java.util.ArrayList;
import java.util.List;

public class Test_575 {
    /**
     *
     * @param candies
     * candies为【2，10000】
     * 数字为【-100000，100000】
     * @return
     */
    public int distributeCandies(int[] candies) {
        /**
         * 简单选择排序并且剔除重复元素
         *V改进：排序后统计不同数字个数即可
        /**
         * 有空研究一下Vector
         */
        /**
         * 变量指针
         */
        candies=selectSort(candies);
        /**
         * 计数
         */
        int num=0;
        num=calculateNum(candies);
        if(num<candies.length/2){
            return num;
        }else {
            return candies.length/2;
        }
    }
    public int[] selectSort(int[] array){
        int min=0,temp=0;
        for(int i=0;i<array.length-1;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp=array[i];
                array[i]=array[min];
                array[min]=temp;
            }
        }
        return array;
    }
    public int calculateNum(int[] array){
        int num=0;
        for (int i = 0; i<array.length-1;i++){
            if(array[i]!=array[i+1]){
                num++;
            }
        }
        return num+1;
    }
    public static void main(String[] args){
        Test_575 test_575 = new Test_575();
        int[] array = new int[]{8,7,6,3,3,9,8,7,5,6,11,23};
        int num=0;
//        int[] array = new int[]{8,7,6,6};
        num=test_575.distributeCandies(array);
        System.out.println(num);
    }
}
