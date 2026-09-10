public class Demo
{
    public static void main(String[] args)
    {
        int number = 1234;

        // automatically casts the number back to int
        number /= 10.0;

        // causes a type mismatch (cannot store double value in int variable)
        number = number / 10.0;

        System.out.println(number);

        // for loop (surprise for later)
        for (int i = 0; i < 5; i++) {

        }
    }
}