package test;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = addNum(num1, num2);
        System.out.println(sum);
    }
    public static int addNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
