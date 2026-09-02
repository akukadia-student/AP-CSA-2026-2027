public class Expressions {
    public static void main(String[] args) {
        // Part 1 - Integers

        // Step 1: Create three integer variables with values.
        int one = 3;
        int two = 2;
        int three = 3;
        // Step 2: Create a sum variable to store the sum of all three.
        int sum = one + two + three;
        // Step 3: Create an average integer variable to store the mean value.
        int mean = sum / 3;
        // Step 4: Print the result of your average. Is it correct?
        System.out.println(mean);
        //No it is cut off the decimal
        // Step 5: Create a second average variable to properly compute the average.
        double mean2 = sum / 3.0;
        System.out.println(mean2);
        // Part 2 - Questions

        // Question 1: What is the data type for the sum of two integers?
        //int
        // Question 2: What is the data type for the quotient of two integers?
        //int
        // Question 3: What is the data type for the product of an integer and a double?
        //double
    }
}