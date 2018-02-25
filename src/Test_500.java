import java.lang.reflect.Array;
import java.util.*;

public class Test_500 {
//    public String[] findWords(String[] words) {
//        List<Boolean> bool_list = new ArrayList<>();
//        char[][] alphet_ch = new char[][]{{'q','w','e','r','t','y','u','i','o','p'},
//                {'a','s','d','f','g','h','j','k','l'},{'z','x','c','v','b','n','m'}};
////        char[] alphet_row_2 = new char[]{'a','s','d','f','g','h','j','k','l'};
////        char[] alphet_row_3 = new char[]{'z','x','c','v','b','n','m'};
//        List<String> list_words = new ArrayList<>();
//        list_words= Arrays.asList(words);
//        for(int i=0;i<list_words.size();i++){
//            bool_list.add(i,true);
//        }
//        String temp="";
//        for(int i=0;i<list_words.size();i++){
//            temp=list_words.get(i);
//            char[] temp_ch = temp.toCharArray();
//            int j=0;
//            int key=-1;
//            for(int k=0;k<3;k++){
//                for(int l=0;l<alphet_ch[k].length;l++){
//                    if(temp_ch[j]==alphet_ch[k][l]){
//                        if(key==-1){
//                            key=k;
//                            j++;
//                        }else if(key==k){
//                            j++;
//                        }else {
//                            bool_list.set(i,false);
//                        }
//                    }
//                }
//            }
//        }
//        int t=0;
//        List<String> list_result = new ArrayList<>();
//        for(int i=0;i<list_words.size();i++){
//            if(bool_list.get(i)==true){
//                list_result.add(t,list_words.get(i));
//                t++;
//            }
//        }
//        String[] result_str = list_result.toArray(new String[list_result.size()]);
//        return words;
//    }
    public String[] findWords(String[] words) {
        int length = words.length;
        List<String> results = new ArrayList<String>();
        char[] row1 = new char[]{'q','w','e','r','t','y','u','i','o','p'};
        char[] row2 = new char[]{'a','s','d','f','g','h','j','k','l'};
        char[] row3 = new char[]{'z','x','c','v','b','n','m'};
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < 10; i++)
            map.put(row1[i], 1);
        for (int i = 0; i < 9; i++)
            map.put(row2[i], 2);
        for (int i = 0; i < 7; i++)
            map.put(row3[i], 3);
        int row = 0;
        for (int i = 0; i < length; i++) {
            String word = words[i].toLowerCase();//大写字母转化为小写字母
            int len = word.length(), j = 0, flag = 0;
            for (; j < len; j++) {
                if (flag == 0) {
                    row = map.get(word.charAt(j));
                    flag = 1;
                }
                else {
                    if (map.get(word.charAt(j)) != row) {
                        break;
                    }
                }
            }
            if (j == len)
                results.add(words[i]);
        }
        int size = results.size();
        String[] result = new String[size];
        for (int i = 0; i < size; i++)
            result[i] = results.get(i);
        return result;
    }
    public static void main(String[] args){
        Test_500 test_500 = new Test_500();
        String[] result = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        result=test_500.findWords(result);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}