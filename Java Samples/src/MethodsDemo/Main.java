package MethodsDemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int number = scanner.nextInt();
        System.out.println(UserMainCode.sumOfSquaresOfEvenDigits(number));
    }
}
