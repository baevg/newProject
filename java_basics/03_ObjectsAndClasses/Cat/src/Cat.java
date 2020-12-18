
public class Cat {
    public static final int EYES_COUNT = 2;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private static int count = 0;

    private String color = "red";

    private String name;

    public Cat() {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        name = "cat";
    }

    public Cat(double weight) {
        this();
        this.weight = weight;
    }

    public Cat copyCat(String name) {
        Cat copyCat = new Cat();
        copyCat.name = name;
        copyCat.weight = this.weight;
        copyCat.originWeight = this.originWeight;
        copyCat.minWeight = this.minWeight;
        copyCat.maxWeight = this.maxWeight;
        return copyCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        getStatus();
        if (isAliveCat()) {
            weight = weight - 1;
            System.out.println("Meow");
        } else {
            System.out.println("Кошка умерла и не может мяукать");
        }
    }

    public void feed(Double amount) {
        getStatus();
        if (isAliveCat()) {
            weight = weight + amount;
        } else {
            System.out.println("Кошка умерла и не сможет покушать");
        }
    }

    public void drink(Double amount) {
        getStatus();
        if (isAliveCat()) {
            weight = weight + amount;
        } else {
            System.out.println("Кошка умерла и не сможет больше пить");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public double getFoodAmount() {
        double count = weight - originWeight;
        if (count < weight) {
            return count;
        } else {
            return 0;
        }
    }

    public void pee() {
        getStatus();
        if (isAliveCat()) {
            weight = weight - 20;
            System.out.println("Кошка сходила в туалет, теперь ее вес = " + getWeight());
        } else {
            System.out.println("Кошка умерла и не может сходить в туалет");
        }
    }

    public static int getCount() {
        return count;
    }

    public boolean isAliveCat() {
        if (weight < minWeight || weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}