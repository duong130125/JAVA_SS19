package BT3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        System.out.println("Tổng: " + ss19.Bai3.MathOperations.add(a, b));
        System.out.println("Hiệu: " + ss19.Bai3.MathOperations.subtract(a, b));
        System.out.println("Tích: " + ss19.Bai3.MathOperations.multiply(a, b));

        try {
            System.out.println("Thương: " + ss19.Bai3.MathOperations.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
