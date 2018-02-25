public class Test_28 {
    public int strStr(String haystack, String needle) {
        int[] next =kmpnext(needle);
        int locate=kmp(haystack,needle,next);
        return locate;
    }
    private int kmp(String str, String dest,int[] next){//str文本串  dest 模式串
        if(dest.length()==0){
            return 0;
        }else{
            if(str.length()==0){
                return -1;
            }else {
                for(int i = 0, j = 0; i < str.length(); i++){
                    while(j > 0 && str.charAt(i) != dest.charAt(j)){
                        j = next[j - 1];
                    }
                    if(str.charAt(i) == dest.charAt(j)){
                        j++;
                    }
                    if(j == dest.length()){
                        return i-j+1;
                    }
                }
            }
        }
        return -1;
    }
    private int[] kmpnext(String dest){//求模式串的next值
        int[] next = new int[dest.length()];
        if(dest.length()==0){
            return next;
        }else {
            next[0] = 0;
        }
        for(int i = 1,j = 0; i < dest.length(); i++){
            while(j > 0 && dest.charAt(j) != dest.charAt(i)){
                j = next[j - 1];
            }
            if(dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public static void main(String[] args){
        Test_28 test_28 = new Test_28();
        String s1="";
        String s2="";
        int test=test_28.strStr(s1,s2);
        System.out.println(test);
//        String a = "ssd";
//        String b = "ssdfgasdbababa";
//        int[] next = test_28.kmpnext(a);
//        int res = test_28.kmp(b, a,next);
//        System.out.println(res);
////        for(int i = 0; i < next.length; i++){
////            System.out.println(next[i]);
////        }
//        System.out.println(next.length);
    }
}
