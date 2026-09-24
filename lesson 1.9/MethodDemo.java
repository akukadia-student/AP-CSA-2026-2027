public class MethodDemo 
{
    public static void main(String[] args) 
    {
        // Use the method we wrote
        int num1 = 3, num2 = 4, num3 = 7;

        double average = averageThree(num1, num2, num3);

        System.out.println(average);
    }
    
    // Write a method to take the average of three ints.
    public static double averageThree(int one, int two, int three)
    {
        double sum = one + two + three;
        double average = sum / 3;

        return average;
    }

}
