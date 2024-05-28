package seminars.third.hw;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    public static void main(String[] args) {
        int n = 6;
        boolean evenOddNumber = evenOddNumber(n);
        System.out.println("Число " + n + " является " + (evenOddNumber ? "чётным" : "нечётным"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isInInterval = numberInInterval(number);
        if(isInInterval){
            System.out.println("Число " + number + " попадает в интервал (25, 100).");
        }
        else {
            System.out.println("Число " + number + " не попадает в интервал (25, 100).");
        }
        scanner.close();
    }
    public static boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }
    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public static boolean numberInInterval(int n){
        return n > 25 && n < 100;
    }
}

