import java.util.ArrayList;
import java.util.List;

public class Test_14 {
    public String longestCommonPrefix(String[] strs) {
        List<String> list = new ArrayList<>();
        int min_length=0;
        String s="";
//        s=strs[min_length];
        for(int i=0;i<strs.length;i++){
            list.add(i,strs[i]);
            if(strs[i].length()<=strs[min_length].length()){
                min_length=i;
                s=strs[i];
            }
        }
//        s=list.get(min_length);
        String result="";
        char[] min_ch = s.toCharArray();
        int tag=1;
        for(int i=0;i<min_ch.length;i++){
            if(tag==1){
                for(int j=0;j<strs.length;j++){
                    char[] temp = list.get(j).toCharArray();
                    if(min_ch[i]!=temp[i]){
                        tag=0;
                        break;
                    }
                }
                if(tag==1){
                    result=result+min_ch[i];
                }else {

                }
            }else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Test_14 test_14 = new Test_14();
      String[] test = new String[]{"a3x54","a3b4","a3sfs","a3x64"};
//        String[] test = new String[]{"a"};
        String result="";
        result=test_14.longestCommonPrefix(test);
        System.out.println(result);
    }
}
