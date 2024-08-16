import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println(a + " + " + b + " = " + (a + b));  // Сложение
        System.out.println(a + " - " + b + " = " + (a - b));  // Вычитание
        System.out.println(a + " * " + b + " = " + (a * b));  // Умножение

        // Проверка деления на ноль и арифметическая операция с делением
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));  // Деление
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        // Закрываем сканер
        scanner.close();
    }
}

