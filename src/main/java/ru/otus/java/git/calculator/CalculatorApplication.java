package ru.otus.java.git.calculator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число");
            int b = scanner.nextInt();
            System.out.println("Введите номер операции: 1 +, 2 -, 3 *");
            int operation = scanner.nextInt();
            if (operation == 1) {
                int result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            }
            if (operation == 2) {
                int result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }
            if (operation == 3) {
                int result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            }
            System.out.println("Хотите ли выполнить еще одну операцию");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if (!answer.equals("y") && !answer.equals("Y")) {
                break;
            }
        }
    }
}
