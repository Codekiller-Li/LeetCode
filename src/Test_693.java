import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test_693 {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    public boolean hasAlternatingBits(int n) {
        List<Integer> list = new ArrayList<>();
        list=int2int_arr(n);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    private List<Integer> int2int_arr(int n){
        List<Integer> num = new ArrayList<>();
        int temp=0;
        while (n>1){
            num.add(temp,n%2);
            n= (int) Math.floor(n/2);
            temp++;
        }
        num.add(temp,n);
        return num;
    }
    private byte[] intToByte(int n) {
        byte[] b = new byte[4];
        b[0] = (byte) (n & 0xff);
        b[1] = (byte) (n >> 8 & 0xff);
        b[2] = (byte) (n >> 16 & 0xff);
        b[3] = (byte) (n >> 24 & 0xff);
        return b;
    }
    public static void main(String[] args){
        Test_693 test_693 = new Test_693();
//        System.out.println(test_693.hasAlternatingBits(10));
        byte[] num = new byte[4];
        num=test_693.intToByte(128);
//        System.out.println(Arrays.toString(test_693.intToByte(10)));
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
