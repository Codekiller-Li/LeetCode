public class Test_9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else {
            int y=0,z=0;
            int k=0;
            int temp=x;
            while (x!=0){
                y=x%10;
                z= z*10+y;
                x= (int) Math.floor(x/10);
                k++;
            }
            if(z==temp){
                return true;
            }else {
                return false;
            }
        }
    }
    public static void main(String[] args){
        Test_9 test_9 = new Test_9();
        int test=-1222;
        boolean result=false;
        result=test_9.isPalindrome(test);
        System.out.println(result);
    }
}
