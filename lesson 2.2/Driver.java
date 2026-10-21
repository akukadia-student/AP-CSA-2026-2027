public class Driver
{
    public static void main(String[] args) 
    {
        int x = 20;
        
        // BOOLEAN EXPRESSION IS EVALUATED FIRST, THEN SAVED
        boolean largerThan100 = x > 100;

        System.out.println(largerThan100);

        // NO EFFECT ON THE BOOLEAN, THE EXPRESSION WAS EVALUATED
        x = 120;

        System.out.println(largerThan100);

        System.out.println();

        double d = 0;
        d += 0.1;
        d += 0.1;
        d += 0.1;
        System.out.println(d == 0.3);
        System.out.println(d);

        double epsilon = 1e-15; //very small
        System.out.println(Math.abs(d - 0.3)<epsilon);
    }
}