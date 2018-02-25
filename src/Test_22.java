import java.util.*;

public class Test_22 {
    public static List<String> list = new ArrayList<>();
    public static int num=0;
    //卡特兰数
    public List<String> generateParenthesis(int n) {
        List<Character> s=new ArrayList<Character>();
        List<Character> rs=new ArrayList<Character>();
        for(int i=0;i<n;i++){
            s.add('(');
            s.add(')');
        }
        getAllRank(s,rs);
        Set<String> set = new HashSet<>();
        for(String i:list){
            set.add(i);
        }
        List<String> result = new ArrayList<>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            result.add((String) iterator.next());
        }
        return result;
    }
    public void getAllRank(List<Character> s,List<Character> rs){
        if(s.size()==1)
        {
            rs.add(s.get(0));
            Boolean t = isRight(rs);
            if(t==true){
                String temp="";
                for(char i:rs){
                    temp=temp+i+"";
                }
                list.add(temp);
            }else {

            }
            rs.remove(rs.size()-1);
        }else{
            for(int i=0;i<s.size();i++){
                rs.add(s.get(i));
                List<Character> tmp=new ArrayList<Character>();
                for(Character a:s)
                    tmp.add(a);
                tmp.remove(i);
                getAllRank(tmp,rs);
                rs.remove(rs.size()-1);
            }
        }
    }
    private Boolean isRight(List<Character> tempList){
        Boolean temp =true;
        Stack stack = new Stack();
        for(Character i:tempList){
            if(i=='('){
                stack.push(i);
            }else {
                if(stack.empty()==true){
                    temp=false;
                    return temp;
                }else {
                    stack.pop();
                }
            }
        }
        temp=true;
        return temp;
    }

    public static void main(String[] args){
        Test_22 test_22 = new Test_22();
        List<String> testList = new ArrayList<>();
        testList=test_22.generateParenthesis(1);
        for(String i:testList){
            System.out.println(i);
        }
    }
}
