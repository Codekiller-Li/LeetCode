public class Test_389 {
    public char findTheDifference(String s, String t) {
        char[] ch_s=s.toCharArray();
        char[] ch_t = t.toCharArray();
        int[] result=new int[t.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(ch_s[i]==ch_t[j]){
                    ch_t[j]='0';
                    break;
                }
            }
        }
        for(int i=0;i<t.length();i++){
            if(ch_t[i]!='0'){
                return ch_t[i];
            }
        }
        return '0';
    }
    public static void main(String[] args){
        Test_389 test_389 = new Test_389();
        String s1 = "abcd";
        String s2="abecd";
        char c=test_389.findTheDifference(s1,s2);
        System.out.println(c);

    }
}
