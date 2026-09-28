public class Geometry {
    public static double mid(int one, int two)
    {
        return (one + two)/2.0;
    }
    public static double distance(int x_1, int x_2, int y_1, int y_2)
    {
        double one = Math.pow(x_2 - x_1, 2);
        double two = Math.pow(y_2 - y_1, 2);
        return Math.sqrt(one+two);
    }
}
