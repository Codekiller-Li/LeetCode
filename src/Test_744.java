import java.util.HashMap;
import java.util.List;

public class Test_744 {
    class Alpha_Hash{
        public char[] Alpha = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                'p','q','r','s', 't','u','v','w','x','y','z'};
        public HashMap<Character,Integer> map = new HashMap<>();
        public Alpha_Hash(HashMap map){
            this.map=map;
            map.put('a',0);map.put('b',1);map.put('c',2);map.put('d',3);map.put('e',4);map.put('f',5);map.put('g',6);map.put('h',7);map.put('i',8);
            map.put('j',9);map.put('k',10);map.put('l',11);map.put('m',12);map.put('n',13);map.put('o',14);map.put('p',15);map.put('q',16);map.put('r',17);
            map.put('s',18);map.put('t',19);map.put('u',20);map.put('v',21);map.put('w',22);map.put('x',23);map.put('y',24);map.put('z',25);
        }
    }
    public char nextGreatestLetter(char[] letters, char target) {
        HashMap<Character,Integer> map = new HashMap<>();
        Alpha_Hash alpha_hash = new Alpha_Hash(map);
        int num=alpha_hash.map.get(target);
        int[] num_letters = new int[letters.length];
        for(int i=0;i<num_letters.length;i++){
            num_letters[i]=alpha_hash.map.get(letters[i]);
        }
        int temp=0;
        for(int i=1;i<26;i++){
            temp=(num+i)%26;
            for(int j=0;j<num_letters.length;j++){
                if(temp==num_letters[j]){
                    return alpha_hash.Alpha[temp];
                }
            }
        }
        return ' ';
    }

    public static void main(String[] args){
        Test_744 test_744=new Test_744();
        char[] test= new char[]{'e','e','e','e','e','e','n','n','n','n'};
        char result=test_744.nextGreatestLetter(test,'z');
        System.out.println(result);
    }
}
