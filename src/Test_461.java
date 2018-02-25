public class Test_461 {
    public int hammingDistance(int x, int y) {
//        int length=-1;
//        int temp_1=0,temp_2=0;
//        int temp=0;
//        if(x<0&&y<0){
//            return length;
//        }
////        else if(x>=y){
////
////            double t1=Math.log(x)/Math.log(2);
////            double t2=Math.log(y)/Math.log(2);
////            temp_1= (int) Math.floor(t1)+1;
////            temp_2= (int) Math.floor(t2)+1;
////            return temp_1-temp_2;
////        }else {
////            double t1=Math.log(x)/Math.log(2);
////            double t2=Math.log(y)/Math.log(2);
////            temp_1= (int) Math.floor(t1)+1;
////            temp_2= (int) Math.floor(t2)+1;
////            return temp_2-temp_1;
////        }
//        else{
//            length=0;
////            double t1=Math.log(x)/Math.log(2);
////            double t2=Math.log(y)/Math.log(2);
////            temp_1= (int) Math.floor(t1)+1;
////            temp_2= (int) Math.floor(t2)+1;
//            while (x/2!=0||x==1){
//                if(x%2==1){
//                    length++;
//                    x=(x-1)/2;
//                }else {
//                    x=x/2;
//                }
//            }
//            temp_1=length;
//            length=0;
//            while (y/2!=0||y==1){
//                if(y%2==1){
//                    length++;
//                    y=(y-1)/2;
//                }else {
//                    y=y/2;
//                }
//            }
//            temp_2=length;
//            return (temp_1>temp_2)?temp_1-temp_2:temp_2-temp_1;
//        }
        int z = x^y;
        int res = 0;
        while(z != 0) {
            if (z%2 == 1) {
                res++;
            }
            z = z/2;
        }
        return res;
    }

    public static void main(String[] args){
        Test_461 test=new Test_461();
        int result = test.hammingDistance(73,93);
        System.out.println(result);
    }
}