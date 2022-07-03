package task03;

/**
 * Задача с применением Scanner для вывода чисел при разных случаях
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < 0 && b > 0 || a > 0 && b < 0) {
            System.out.println(a * b);
        } else if (a > b) {
            System.out.println(a - b);
        } else if (a < 0 && b < 0) {
            System.out.println(a + b);
        } else {
            System.out.println(a % b);
        }
    }
}
