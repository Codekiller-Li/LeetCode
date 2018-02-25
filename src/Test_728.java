import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

public class Test_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            List<Integer> num = getNum(i);
            int TAG=0;
            for(Integer j:num){
                if(j==0){
                    TAG=1;
                    break;
                }else {
                    if(i%j==0){
                        continue;
                    }else {
                        TAG=1;
                        break;
                    }
                }
            }
            if(TAG==0){
                list.add(i);
            }
        }
        return list;
    }
    private List getNum(int num){
        List<Integer> list = new ArrayList<>();
        while (num>0){
            list.add(num%10);
            num= (int) Math.floor(num/10);
        }
        for(Integer i:list){
            System.out.println(i);
        }
        return list;
    }
    public static void main(String[] args){
        Test_728 test_728 = new Test_728();
        for(Integer i:test_728.selfDividingNumbers(1,22)){
            System.out.println(i);
        }
    }
}
