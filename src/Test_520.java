import java.util.ArrayList;
import java.util.List;

public class Test_520 {
    public boolean detectCapitalUse(String word) {
        int tag=0;
        if(word.equals("")){
            return false;
        }else {
            for(int i=0;i<word.length();i++){
                char ch_word = word.charAt(i);
                if(tag==0){
                    if(i==0&&Character.isUpperCase(ch_word)){
                        tag=1;
                    }else if(i==0&&Character.isLowerCase(ch_word)){
                        tag=0;
                    }else if(i!=0&&Character.isLowerCase(ch_word)){
                        tag=0;
                    }else {
                        return false;
                    }
                }else if(tag==1){
                    if(i==1&&Character.isLowerCase(ch_word)){
                        tag=2;
                    }else if(Character.isUpperCase(ch_word)){
                        tag=1;
                    }else {
                        return false;
                    }
                }else if(tag==2){
                    if(Character.isLowerCase(ch_word)){
                        tag=2;
                    }else {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        String str= "EEJIHEHEFIEFBBBBaefanfnawjfbawebf";
        boolean test=true;
        Test_520 test_520 = new Test_520();
        test=test_520.detectCapitalUse(str);
        System.out.println(test);
    }
}
