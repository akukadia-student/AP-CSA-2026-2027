import java.util.Scanner;

public class InputDemo
{
    public static void main(String[] args)
    {
        String name = "Mr. Merritt";

        // key difference is the new keyword
        //  new -> create an object
        String name2 = new String("Arkin");

        // creates a new scanner called keyboard that reads from the
        //  terminal input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");

        // read in an entire line of input from the keyboard
        String inputName = keyboard.nextLine();

        System.out.print("Your name is ");
        System.out.println(inputName);

        // can read int
        System.out.print("Enter your number: ");
        int myNumber = keyboard.nextInt();

        System.out.println(myNumber);


        // read in an entire line of input from the keyboard
        System.out.print("Enter your last name: ");

        // clear out extra line
        keyboard.nextLine();

        // the next goes on top
        String lastName = keyboard.nextLine();

        System.out.println(lastName);
    }
}