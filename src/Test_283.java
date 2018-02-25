public class Test_283 {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int k=0;
            while (nums[i]==0){
                int temp=0;
                for(int j=i;j<nums.length-1;j++){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                k++;
                if(i+k==nums.length){
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args){
        Test_283 test_283 = new Test_283();
        int[] test = new int[]{0,0,1};
        test_283.moveZeroes(test);
    }
}
