public class Test_553 {
    /**
     * 给N个连除的数字加括号，所有的结果，取出其中的最大值
     */
    public String optimalDivision(int[] nums) {
        String s="";
        for(int i=0;i<nums.length;i++){
            if(nums.length>2){
                if(i==0){
                    s=s+nums[i]+"/"+"(";
                }else if(i==nums.length-1){


                    s=s+nums[i]+")";
                }else {
                    s=s+nums[i]+"/";
                }
            } else if(nums.length==2){
                if(i==0){
                    s=s+nums[i]+"/";
                }else {
                    s=s+nums[i]+"";
                }
            }else {
                s=s+nums[i]+"";
            }
        }
        return s;
    }
    public static void main(String[] args){
        Test_553 test_553 = new Test_553();
        int[] test = new int[]{8};
        String s="";
        s=test_553.optimalDivision(test);
        System.out.println(s);
    }
}
