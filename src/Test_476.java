public class Test_476 {
    public int findComplement(int num) {
//        int temp=0,sum=0;
//        if (num==0){
//            temp=temp+1;
//        }else if(num>=2147483647){
////            return 0;
//        } else {
//            temp= (int) (Math.log(num)/Math.log(2))+1;
//        }
//        sum= (int) Math.pow(2,temp);
//        int test=0;
//        test=(sum-1)^num;
//        return test;
        int mask = 1, temp = num;
            while(temp > 0) {
                mask = mask << 1;
                temp = temp >> 1;
            }
        return num^(mask-1);

//        String binary="";
//        binary=toBinary(num);
//        int sum=0;
//        char[] chararr=binary.toCharArray();
//
////        sum=Integer.parseInt(temp);
//        return sum;
    }
//    public String toBinary(int num){
//        String temp="";
//        temp=Integer.toBinaryString(num);
//        return temp;
//    }
    public static void main(String[] args){
        Test_476 test_476 = new Test_476();
        int num=2147483646;
        int test=0;
        test=test_476.findComplement(num);
        System.out.println(test);



    }
}
