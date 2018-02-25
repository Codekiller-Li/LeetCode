public class Test_521 {
    /**
     * 非连续最长非公共子串
     * Tips:求出所有重复字母个数，然后两个字符串减去重复字母求出较大的那个长度
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {
        int length=-1;
        int temp=0;
        int len_a=a.length(),len_b=b.length();
        char[] ch_a = new char[len_a];
        char[] ch_b = new char[len_b];
        ch_a=a.toCharArray();
        ch_b=b.toCharArray();
        for(int i=0 ; i<len_a;i++){
            for(int j=temp;j<len_b;j++){
                if(ch_a[i]==ch_b[j]){
                    temp=j;
                    break;
                }
            }
        }
        return length;
    }
    /**
     * 连续最长非公共字串
     */
}
