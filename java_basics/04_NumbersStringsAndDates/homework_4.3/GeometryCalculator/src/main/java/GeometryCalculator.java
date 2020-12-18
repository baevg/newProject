public class GeometryCalculator {
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(Math.abs(radius), 2);
    }

    public static double getSphereVolume(double radius) {
        return (4 * Math.PI * Math.pow(Math.abs(radius), 3)) / 3;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)){
            return -1;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
