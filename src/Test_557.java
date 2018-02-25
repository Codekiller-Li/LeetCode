public class Test_557 {
    /*
    非StringBuffer方法未完成
     */
//    public String reverseWords(String s) {
//        String[] count_str = s.split("\\s+");
//        String result="";
//        for(int i=0;i<count_str.length;i++){
//            result=result+" "+reverse(count_str[i]);
//        }
//        return result;
//    }
//    public String reverse(String s){
////        char[] ch_str = s.toCharArray();
////        char temp='0';
//////        int j=ch_str.length-1;
////        for(int i=0;i<ch_str.length/2;i++){
////            temp=ch_str[i];
////            ch_str[i]=ch_str[ch_str.length-i-1];
////            ch_str[ch_str.length-i-1]=temp;
////        }
////        return s;
//        StringBuffer sb = new StringBuffer(s);
////通过reverse()反转方法，反转；然后转换成字符串
//        return sb.reverse().toString();
//    }
    public String reverseWords(String s) {
        String[] count_str = s.split(" ");
        String result="";
        for(int i=0;i<count_str.length;i++){
            if(i==count_str.length-1){
                result=result+reverse(count_str[i]);
            }else {
                result=result+reverse(count_str[i])+" ";
            }
        }
        return result;
    }
    public String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Test_557 test_557 = new Test_557();
        String s=" Lets sdfd98 pio  puo";
        s=test_557.reverseWords(s);
        System.out.println(s);
    }
}
