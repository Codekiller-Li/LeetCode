import java.sql.Array;
import java.util.Arrays;

public class Test_696 {
    public int countBinarySubstrings(String s) {
        char[] num = s.toCharArray();
        int[] length = new int[s.length()];
        int temp=1;
        int t=0;
        int result=0;
        length[0]=1;
        for(int i=0;i<s.length()-1;i++){
            int k=(int)num[i];
            int ks=(int)num[i+1];
            if(k==ks){
                temp=temp+1;
                length[t]=temp;
            }else if(k!=ks){
                temp=1;
                t++;
                length[t]=temp;
            }
        }

        for(int i=0;i<length.length-1;i++){
            result=result+getMin(length[i],length[i+1]);
        }
        return result;
    }
    private int getMin(int a,int b){
        int min=(a<b)?a:b;
        return min;
    }
    public static void main(String[] args){
        Test_696 test_696 = new Test_696();
        String s ="00110011";
//        "00110011";
        int test=0;
        test=test_696.countBinarySubstrings(s);
        System.out.println(test);
//        int[] test_0 = new int[s.length()];
//        test_0=test_696.countBinarySubstrings(s);
//        for(int i=0;i<test_0.length;i++){
//            System.out.println(test_0[i]);
//        }
    }
}
