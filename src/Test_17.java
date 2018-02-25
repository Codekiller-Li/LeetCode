import java.util.ArrayList;
import java.util.List;

public class Test_17 {
    public static List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int length=digits.length();
        getRank(4,length);
        //list表示digits长度的可重复全排列，比如digits="23"，digits_length=2,list={"11","12","13"....}
        char[] digits_num= digits.toCharArray();
        int[] digits_numbers=new int[digits.length()];
        for(int i=0;i<digits_num.length;i++){
            digits_numbers[i]=Integer.parseInt(String.valueOf(digits_num[i]));
        }
        //digits_numbers表示digits数字数组，比如digits="23",digits_numbers=[2,3]
        for(String i:list){
            char[] num=i.toCharArray();
            int[] numbers=new int[digits.length()];
            for(int j=0;j<num.length;j++){
                numbers[j]=Integer.parseInt(String.valueOf(num[j]))-1;//1234转化为数组标识0123
            }
            String temp="";
            temp=convertNum(digits_numbers,numbers);
            temp=temp.replace(" ","");
            if(temp.length()<digits.length()){

            }else {
                result.add(temp);
            }
        }
        return result;
    }
    private String convertNum(int[] digits_numbers,int[] numbers){
        StringBuilder s= new StringBuilder();
        char[] ch_2 = new char[]{'a','b','c',' '};
        char[] ch_3 = new char[]{'d','e','f',' '};
        char[] ch_4 = new char[]{'g','h','i',' '};
        char[] ch_5 = new char[]{'j','k','l',' '};
        char[] ch_6 = new char[]{'m','n','o',' '};
        char[] ch_7 = new char[]{'p','q','r','s'};
        char[] ch_8 = new char[]{'t','u','v',' '};
        char[] ch_9 = new char[]{'w','x','y','z'};
        char[] ch_10 = new char[]{};
        for(int i=0;i<digits_numbers.length;i++){
            switch (digits_numbers[i]){
                case 2:
                    s.append(ch_2[numbers[i]]);
                    break;
                case 3:
                    s.append(ch_3[numbers[i]]);
                    break;
                case 4:
                    s.append(ch_4[numbers[i]]);
                    break;
                case 5:
                    s.append(ch_5[numbers[i]]);
                    break;
                case 6:
                    s.append(ch_6[numbers[i]]);
                    break;
                case 7:
                    s.append(ch_7[numbers[i]]);
                    break;
                case 8:
                    s.append(ch_8[numbers[i]]);
                    break;
                case 9:
                    s.append(ch_9[numbers[i]]);
                    break;
                default:
                    break;
            }
        }
        return s.toString();
    }

    private void getRank(int input,int length){
        //input该题目为4，length为digits长度
        List<Integer> arr = new ArrayList<>();
        int i=0;
        arr.add(0,1);
        while(true){
            if(i == length - 1){
                outputResult(arr,length);
            }
            if(i < length - 1){
                i++;
                arr.add(i,1);////每个都要从1开始
                continue;
            }
            while(arr.get(i)==input) {
                i--;
                if(i<0){
                    break;
                }
            }
            if(i>=0){
                arr.add(i,arr.get(i)+1);
            } else{
                break;
            }
        }
    }

    private void outputResult(List<Integer> arr,int length){
        String s="";
        for(int i=0;i<length;i++){
            s=s+arr.get(i)+"";
        }
        list.add(s);
    }

    public static void main(String[] args){
        Test_17 test_17 = new Test_17();
        String test="32";
        List<String> result = new ArrayList<>();
        result=test_17.letterCombinations(test);
        for(String i:result){
            System.out.println(i);
        }
    }
}
