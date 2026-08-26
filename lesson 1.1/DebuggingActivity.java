public class DebuggingActivity 
{
    public static void main(String[] args)
    {
        int number = 5;

        while (number > -5)
        {
            int remainder = number % 2;
            boolean isOdd = remainder == 1;

            if (isOdd)
            {
                System.out.println("The number " + number + " is odd.");
            }
            else
            {
                System.out.println("The number " + number + " is even.");
            }

            number = number - 1;
        }
    }    
}
