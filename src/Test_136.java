public class Test_136 {
    public int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[0]^=nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args){
        Test_136 test_136 = new Test_136();
        int[] test = new int[]{8,6,9,7,3,6,7,8,9};
        int t=0;
        t=test_136.singleNumber(test);
        System.out.println(t);
    }
}
