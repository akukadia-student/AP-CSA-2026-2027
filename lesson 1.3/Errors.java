public class Errors {
    public static void main(String[] args) {
        // Part 2 - Errors

        // Step 1: Create a double variable, and store the value 5 in it.
        double number = 5;
        // Step 2: Print the value. Did anything happen?
        System.out.println(number);
        //It turned from an int to a double
        // Step 3: Create an integer variable, and store the value 3.2 in it.
        int value = (int) 3.2;
        System.out.println(value);
        // Step 4: Print the value. Did anything happen?
        // You can't convert a double to an int
    }
}
