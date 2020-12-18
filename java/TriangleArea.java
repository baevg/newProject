package lesson03;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты первой точки A(x1; y1)");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();

        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты второй точки B(x2; y2)");
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();

        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты третьей точки C(x3; y3)");

        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();

        System.out.print("x3 = ");
        double y3 = scanner.nextDouble();

        double epsilon = 0.0001;

        if (Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) <= epsilon) {
            System.out.println("Невозможно вычислить площадь треугольника");
        } else {
            double sideALength = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            System.out.printf("Длина стороны а = %.2f%n", sideALength);

            double sideBLength = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
            System.out.printf("Длина стороны b = %.2f%n", sideBLength);

            double sideCLength = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
            System.out.printf("Длина стороны c = %.2f%n", sideCLength);

            double halfPerimeter = (sideALength + sideBLength + sideCLength) / 2;
            System.out.printf("Полупериметр треугольника P = %.2f%n", halfPerimeter);

            double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - sideALength) * (halfPerimeter - sideBLength) * (halfPerimeter - sideCLength));
            System.out.printf("Площадь треугольника S = %.2f", triangleArea);
        }
    }
}
