public class Test_27 {
    public int removeElement(int[] nums, int val) {
        int[] p = nums;
        int temp=0;
        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            if(p[i]!=val){
                nums[temp]=p[i];
                temp++;
            }else {
                length--;
            }
        }
        return length;
    }

    public static void main(String[] args){
        Test_27 test_27 = new Test_27();
        int[] test = new int[]{4,3,6,4};
        int length=test_27.removeElement(test,4);
        System.out.println(length);
    }
}
