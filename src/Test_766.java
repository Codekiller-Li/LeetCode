import java.util.ArrayList;
import java.util.List;

public class Test_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int j=0;j<matrix[0].length;j++){
            List<Integer> list = new ArrayList<>();
            getArr(matrix,0,j,list);
            if(list.size()==1){
                continue;
            }else {
                for(int t=0;t<list.size()-1;t++){
                    if(list.get(t)==list.get(t+1)){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            List<Integer> list = new ArrayList<>();
            getArr(matrix,i,0,list);
            System.out.println(list.size());
            if(list.size()==1){
                continue;
            }else {
                for(int t=0;t<list.size()-1;t++){
                    if(list.get(t)==list.get(t+1)){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void getArr(int[][] matrix,int x,int y,List list){
        while (x>=matrix.length || y>=matrix[0].length){
            return;
        }
        list.add(matrix[x][y]);
        getArr(matrix,x+1,y+1,list);
    }

    public static void main(String[] args){
        Test_766 test_766 = new Test_766();
        int[][] test = {{1,2,3,4}};
        System.out.println(test_766.isToeplitzMatrix(test));
    }
}
