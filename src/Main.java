import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Консольный калькулятор ===");
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        if (operation == '+') {
            System.out.println("Результат: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Результат: " + (num1 - num2));
        } else if (operation == '/') {
            if(num2 == 0) {System.out.println("Ошибка: на ноль делить нельзя!");}
            else{System.out.println("Результат: " + (num1 / num2));}
        } else {
            System.out.println("Ошибка: неизвестная операция!");
        }
    }
}