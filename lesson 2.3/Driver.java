import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        System.out.println(number);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println(choice);

        if (number == choice)
        {
            System.out.println("=");
        }
        else
        {
            if (number > choice)
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("<");
            }
        }

        /*
        if (number == choice)
            System.out.println("=");
        else if (number > choice)
            System.out.println(">");
        else 
            System.out.println("<");
        */

        String name = new String("Arkin");
        String name2 = new String("Arkin");

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
