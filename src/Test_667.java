import java.lang.reflect.Array;
import java.util.*;

public class Test_667 {
//    public static int K=0,N=0;
//    public int[] constructArray(int n, int k) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> allList= new ArrayList<>();
//        for(int i=0;i<n;i++){
//            list.add(i+1);
//        }
//        K=k;
//        N=n;
//        int[] result= new int[n];
//        try {
//            getAllRank(list,allList,result);
//        } catch (StopMsgException e) {
//            for(int i=0;i<result.length;i++){
//                System.out.println(result[i]);
//            }
//        }
//        return result;
//    }
//    public void getAllRank(List<Integer> s,List<Integer> rs,int[] result){
//        if(s.size()==1)
//        {
//            rs.add(s.get(0));
//            int[] temp = new int[N-1];
//            int k=K;
//            for(int i=0;i<rs.size()-1;i++){
//                temp[i]=Math.abs(rs.get(i)-rs.get(i+1));
//            }
//            Set<Integer> set= new HashSet<>();
//            for(int i=0;i<temp.length;i++){
//                set.add(temp[i]);
//            }
//
//            if(set.size()==k){
//                for(int i=0;i<rs.size();i++){
//                    result[i]=rs.get(i);
//                }
//                throw new StopMsgException();
//            }else {
//
//            }
//            rs.remove(rs.size()-1);
//        }else{
//            for(int i=0;i<s.size();i++){
//                rs.add(s.get(i));
//                List<Integer> tmp=new ArrayList<>();
//                for(Integer a:s)
//                    tmp.add(a);
//                tmp.remove(i);
//                getAllRank(tmp,rs,result);
//                rs.remove(rs.size()-1);
//            }
//        }
//    }
//    static class StopMsgException extends RuntimeException {
//    }
public int[] constructArray(int n, int k) {
    int[]result=new int[n];
    int st=(k/2)+1;
    boolean flag=k%2==0?false:true;
    result[0]=st;
    for(int i=1;i<=k;i++){
        if(flag)
            result[i]=result[i-1]+i;
        else
            result[i]=result[i-1]-i;
        flag=!flag;
    }
    for(int i=k+1;i<n;i++)
        result[i]=i+1;
    return result;
}
    public static void main(String[] args){
        Test_667 test_667 = new Test_667();
        int[] test= test_667.constructArray(92,80);
        System.out.println(test.toString());
    }
}
