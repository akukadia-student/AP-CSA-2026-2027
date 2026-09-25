public class Driver {
    public static void main(String[] args) 
    {
        System.out.println(Calculator.add(3, 5));
        System.out.println(Calculator.div(Calculator.square(3), 2));
        System.out.println(Calculator.div(5, 0));
    }
}
