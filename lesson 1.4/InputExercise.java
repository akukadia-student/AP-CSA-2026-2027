import java.util.Scanner;

public class InputExercise
{
    public static void main(String[] args) 
    {
        // Step 1: Create a Scanner to receive input from the keyboard.

        Scanner keyboard = new Scanner(System.in);

        // Step 2: Ask the user for their name.

        System.out.print("What is your name? ");
        String inputName = keyboard.nextLine();

        // Step 3: Read the name from the input.

        System.out.println(inputName);

        // Step 4: Ask the user for three test scores, storing the sum only.

        System.out.print("What is your test score 1? ");
        int sum = keyboard.nextInt();
        System.out.print("What is your test score 2? ");
        sum = sum + keyboard.nextInt();
        System.out.print("What is your test score 3? ");
        sum += keyboard.nextInt();


        // Step 5: Calculate the average using the sum.

        double average = sum/3.0;

        // Step 6: Print the average in the following format: "Test average: ##.#"
        System.out.println("Test average: " + average);
    }
}