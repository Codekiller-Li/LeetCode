import java.util.ArrayList;
import java.util.List;

public class Test_7 {
    public int reverse(int x) {
        int tag=0;//0为正数，1为负数
        int result=0;
        if(x==0){
            return 0;
        }else if(x>0){
            tag=0;
        }else {
            tag=1;
        }
        long num=0;
        List<Integer> list = getNum(x);
        int P=1;
        for(int i=list.size()-1;i>=0;i--){
            Long a = new Long((long)list.get(i)*P);
            num = a + num;
            P=P*10;
        }
        if(tag==0){

        }else {
            num=-num;
        }
        if(num>2147483647||num<-2147483648){
            return 0;
        }else {
            result= (int) num;
        }
        return result;
    }
    private List getNum(int x){
        x=Math.abs(x);
        List<Integer> list = new ArrayList<>();
        int temp=0;
        while (x!=0){
            list.add(temp,x%10);
            x= (int) Math.floor(x/10);
            temp++;
        }
        return list;
    }
    public static void main(String[] args){
        Test_7 test_7  = new Test_7();
        int test=1534236469;
        test=test_7.reverse(test);
        System.out.println(test);
    }
}
