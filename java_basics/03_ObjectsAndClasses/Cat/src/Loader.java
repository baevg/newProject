
public class Loader {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        System.out.println("Вес первой кошки = " + cat1.getWeight());
        System.out.println("Вес второй кошки = " + cat2.getWeight());
        System.out.println("Вес третьей кошки = " + cat3.getWeight());
        System.out.println("Вес четвертой кошки = " + cat4.getWeight());
        System.out.println("Вес пятой кошки = " + cat5.getWeight());

        cat1.feed(100.0);
        cat2.feed(120.0);

        System.out.println("Покормили первую кошку: " + cat1.getWeight());
        System.out.println("Покормили вторую кошку: " + cat2.getWeight());

        while (cat1.getWeight() < 9000) {
            cat1.feed(150.0);
        }

        System.out.println("Статус перекормленной кошки: " + cat1.getStatus());

        while (cat2.getWeight() > 1000) {
            cat2.meow();
        }

        System.out.println("Статус замяуканной кошки: " + cat2.getStatus());

        cat3.feed(150.0);
        System.out.println("Количество съеденной еды третьей кошкой = " + cat3.getFoodAmount());
        cat4.pee();
        cat4.pee();
        cat4.pee();

        System.out.println("Количество кошек = " + Cat.getCount());

        System.out.println(cat2.getWeight() + " - " + cat2.isAliveCat());
        cat2.pee();
        cat1.feed(22.2);

        Cat barsik = getKitten();
        Cat murka = getKitten();
        Cat vaska = getKitten();
        System.out.println("Вес Барсика: " + barsik.getWeight());
        System.out.println(murka.getStatus());

        System.out.println();
        cat5.setName("Murka");
        System.out.println(cat5.getName() + " - " + cat5.getWeight() + " - " + cat5.getStatus());
        Cat vasia = cat5.copyCat("Vasia");
        System.out.println(vasia.getName() + " - " + vasia.getWeight() + " - " + vasia.getStatus());
    }

    private static Cat getKitten() {
        return new Cat(1100.00);
    }
}