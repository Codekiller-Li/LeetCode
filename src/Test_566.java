import java.util.ArrayList;
import java.util.List;

public class Test_566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        List<Integer>list = new ArrayList<>();
        int k=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                list.add(k,nums[i][j]);
                k++;
            }
        }
        k=0;
        if(r*c!=nums.length*nums[0].length){
            return nums;
        }else {
            int[][] result = new int[r][c];
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    result[i][j]=list.get(k);
                    k++;
                }
            }
            return result;
        }
    }

    public static void main(String[] args){
        int r=3,c=2;
        Test_566 test_566 = new Test_566();
        int[][] test = new int[][]{{1,2,5},{3,4,6}};
        test=test_566.matrixReshape(test,r,c);
        for(int i=0;i<test.length;i++){
            for (int j=0;j<test[0].length;j++){
                System.out.println(test[i][j]);
            }
        }
    }
}
