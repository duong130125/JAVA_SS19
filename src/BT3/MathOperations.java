package BT3;

public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {

        if (b == 0) {
            System.out.println("không thể chia cho 0");
            return 0;

        }
        return (double) a / b;
    }

}
