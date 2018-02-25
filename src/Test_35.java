public class Test_35 {
    public int searchInsert(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        while (low<=high) {
            int middle= (int) Math.floor((low+high)/2);
            if (nums[middle]==target) {
                return middle;
            }
            else if (nums[middle]>target) {
                high=middle-1;
            }
            else {
                low=middle+1;
            }
        }
        if(high==-1){
            return 0;
        }else {
            if(nums[high]<target){
                high=high+1;
            }else {

            }
        }
        return high;
    }
    public static void main(String[] args){
        Test_35 test_35 = new Test_35();
        int[] test = new int[]{1,3,5,6};
        System.out.println(test_35.searchInsert(test,5));
    }
}
