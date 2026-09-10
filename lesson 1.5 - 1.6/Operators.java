public class Operators{
    public static void main(String[] args) {
        
    int number = 1234;
    int remainder = number % 10;
    number /= 10;
    System.out.println(number);
    System.out.println(remainder);
    remainder = number % 10;
    number /= 10;
    System.out.println(number);
    System.out.println(remainder);
    }
}