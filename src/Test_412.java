import java.util.ArrayList;
import java.util.List;

public class Test_412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)%3==0&&(i+1)%5==0){
                list.add(i,"FizzBuzz");
            }else if((i+1)%3==0){
                list.add(i,"Fizz");
            }else if((i+1)%5==0){
                list.add(i,"Buzz");
            }else {
                list.add(i,i+1+"");
            }
        }
        return list;
    }
    public static void main(String[] args){
        Test_412 test_412= new Test_412();
        List<String> list = new ArrayList<>();
        list=test_412.fizzBuzz(15);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
