public class Test_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int tag=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(tag==1){
                    if(nums1[i]<nums2[j]){
                        nums1[i]=nums2[j];
                        tag=2;
                        break;
                    }
                }else {
                    if(nums1[i]==nums2[j]){
                        tag=1;
                    }
                }
            }
            if(tag==0||tag==1){
                nums1[i]=-1;
                tag=0;
            }else {
                tag=0;
                continue;
            }
        }
        return nums1;
    }
    public static void main(String[] args){
        Test_496 test_496 = new Test_496();
        int[] num1 = new int[]{4,1,2};
        int[] num2 = new int[]{1,3,4,2};
        num1=test_496.nextGreaterElement(num1,num2);
//        System.out.println(num1.length);
        for(int i=0 ; i<num1.length;i++){
            System.out.println(num1[i]);
        }
    }
}
