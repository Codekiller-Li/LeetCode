import java.util.Stack;

public class Test_657 {
    public boolean judgeCircle(String moves) {
        char [] moves_Array = moves.toCharArray();
        int u_count=0,d_count=0,l_count=0,r_count=0;
//        Stack<Character>sk = new Stack<>();
        for(int i=0;i<moves.length();i++){
            switch (moves_Array[i]){
                case 'U':
                    u_count++;
                    break;
                case 'D':
                    d_count++;
                    break;
                case 'L':
                    l_count++;
                    break;
                case 'R':
                    r_count++;
                    break;
                default:
                    break;
            }
        }
        if(u_count==d_count&&r_count==l_count){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Test_657 test_657 = new Test_657();
        boolean result = test_657.judgeCircle("LL");
        System.out.println(result);
    }
}