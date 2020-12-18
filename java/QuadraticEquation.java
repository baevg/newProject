package lesson03;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Коэффициент a = ");
        double a = scanner.nextDouble();

        System.out.print("Коэффициент b = ");
        double b = scanner.nextDouble();

        System.out.print("Коэффициент c = ");
        double c = scanner.nextDouble();

        double epsilon = 0.000001;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) > epsilon) {
                System.out.printf("Это линейное уравнение, т.к. коэффициент а = %.2f%n", a);

                double x = -c / b;

                System.out.printf("X в этом уравнении  = %.3f%n", x);
            } else {
                if (Math.abs(c) <= epsilon) {
                    System.out.println("Есть бесконечное множество решений");
                } else {
                    System.out.println("Решений нет");
                }
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.printf("Корень квадратного уравнения = %.2f", x);
            } else if (discriminant > epsilon) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Первый корень квадратного уравнения = %.2f%n", x1);
                System.out.printf("Второй корень квадратного уравнения = %.2f", x2);
            } else {
                System.out.println("Уравнение не имеет корней");
            }
        }
    }
}
