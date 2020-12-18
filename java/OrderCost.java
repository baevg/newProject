package lesson06;

import java.util.Scanner;

public class OrderCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double milkPrice = 70;
        double coffePrice = 120;

        System.out.print("Сколько пакетов молока Вам нужно? - ");
        int product1Count = scanner.nextInt();

        System.out.print("Сколько банок кофе Вам нужно? - ");
        int product2Count = scanner.nextInt();

        double price = getOrderCost(product1Count, milkPrice, product2Count, coffePrice);
        System.out.printf("Стоимость заказа составляет %.2f руб.", price);
    }

    private static double getOrderCost(int product1Count, double product1Price, int product2Count, double product2Price) {
        final double simpleDiscount = 0.05;
        final double specialDiscount = 0.1;
        final int totalProductsCount = 10;
        final double totalOrderCost = 1000;

        double productsCount = product1Count + product2Count;
        double orderCost = (product1Count * product1Price) + (product2Count * product2Price);

        if (productsCount >= totalProductsCount && orderCost >= totalOrderCost) {
            return orderCost - (orderCost * specialDiscount);
        } else if (productsCount >= totalProductsCount || orderCost >= totalOrderCost) {
            return orderCost - (orderCost * simpleDiscount);
        } else {
            return orderCost;
        }
    }
}
