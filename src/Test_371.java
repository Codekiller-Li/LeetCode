public class Test_371 {
    public int getSum(int x, int y) {
        if (y == 0) return x;
        int sum, carry;
        sum = x ^ y;
        carry = (x & y) << 1;
        return getSum(sum, carry);
    }
    public static void main(String[] args){
        Test_371 test_371 = new Test_371();
        int test=0;
        test = test_371.getSum(5,2);
        System.out.println(test);
    }
}
