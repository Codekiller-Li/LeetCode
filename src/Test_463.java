public class Test_463 {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length+2,col = grid[0].length+2;
        int[][] grid_temp = new int[row][col];
        for(int i=0;i<grid_temp.length;i++){
            for (int j=0;j<grid_temp[0].length;j++){
                if(i==0||i==grid_temp.length-1||j==0||j==grid_temp[0].length-1){
                    grid_temp[i][j]=0;
                }else {
                    grid_temp[i][j]=grid[i-1][j-1];
                }
            }
        }
        int sum=0,temp=0;
        for(int i=0;i<grid_temp.length;i++){
            for(int j=0;j<grid_temp[0].length;j++){
                if(grid_temp[i][j]==1){
                    sum+=4;
                    if(grid_temp[i][j-1]==1){
                        temp++;
                    }
                    if(grid_temp[i-1][j]==1){
                        temp++;
                    }
                    if (grid_temp[i+1][j]==1){
                        temp++;
                    }
                    if (grid_temp[i][j+1]==1){
                        temp++;
                    }
                }
            }
        }
        sum=sum-temp;
        return sum;
    }
    public static void main(String[] args){
        Test_463 test_463 = new Test_463();
        int[][] test = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int result=0;
        result=test_463.islandPerimeter(test);
        System.out.println(result);
    }
}
