import java.util.Arrays;

/**
 * 这题可以先解决n个数组的k划分问题
 * 动态规划
 * 参考了博客
 */

public class Test_698 {
//    public boolean canPartitionKSubsets(int[] nums, int k) {
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum=sum+nums[i];
//        }
//        if(sum%k==0){
//
//        }else {
//            return false;
//        }
//    }
//    private int[][] devidedArr(int[] arr,int k){
//
//    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int N = nums.length;
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int target = sum / k;
        if (sum % k > 0 || nums[N - 1] > target) return false;

        boolean[] dp = new boolean[1 << N];
        dp[0] = true;
        int[] total = new int[1 << N];

        for (int state = 0; state < (1 << N); state++) {
            if (!dp[state]) continue;
            for (int i = 0; i < N; i++) {
                int future = state | (1 << i);
                if (state != future && !dp[future]) {
                    if (nums[i] <= target - (total[state] % target)) {
                        dp[future] = true;
                        total[future] = total[state] + nums[i];
                    } else {
                        break;
                    }
                }
            }
        }
        return dp[(1 << N) - 1];
    }
    public static void main(String[] args){
        Test_698 test_698 = new Test_698();
        int[] test = new int[]{5,3,4,9,7,6,5,4,3,2};
        Boolean result = true;
        result=test_698.canPartitionKSubsets(test,3);
        System.out.println(result);
    }
}
