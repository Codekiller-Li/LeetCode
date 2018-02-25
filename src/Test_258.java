import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeKiller on 2017/12/17.
 */
public class Test_258 {
    public int addDigits(int num) {
        List<Integer> list_int = new ArrayList<>();
        int temp=0;
        if(num<10){
            return num;
        }else {
            while (num>=10){
                list_int=getNum(num);
                num=numConvert((ArrayList<Integer>) list_int);
            }
            return num;
        }
    }
    private int numConvert(ArrayList<Integer> list){
        int result=0;
        for(int i=0;i<list.size();i++){
            result=result+list.get(i);
        }
        return result;
    }

    private ArrayList getNum(int num){
        List<Integer> list_int = new ArrayList<>();
        int i=0;
        while (num!=0){
            list_int.add(i,num%10);
            i++;
            num= (int) Math.floor(num/10);
        }
        return (ArrayList) list_int;
    }

    public static void main(String[] args){
        Test_258 test_258 = new Test_258();
        int test=38;
        test=test_258.addDigits(test);
        System.out.println(test);
    }
}
