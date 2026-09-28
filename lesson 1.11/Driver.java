public class Driver {
    public static void main(String[] args) {
        int x_1 = (int)(Math.random()* 5);
        System.out.println(x_1);
        int x_2 = (int)(Math.random()* 5);
        System.out.println(x_2);
        int y_1 = (int)(Math.random()* 7) + 2;
        System.out.println(y_1);
        int y_2 = (int)(Math.random()* 11) - 5;
        System.out.println(y_2);
        
        System.out.println(Geometry.mid(x_1, x_2));
        System.out.println(Geometry.mid(y_1, y_2));
        System.out.println(Geometry.distance(x_1, x_2, y_1, y_2));
    }
}
