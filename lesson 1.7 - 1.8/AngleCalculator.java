/**
 * AngleCalculator - A program to help with graphing angles in LaTeX by calculating
 *  the location of points on a circle with a given radius at a specified angular 
 *  position. Uses command line arguments.
 * 
 * @author Matthew Merritt
 * @version 1.0 (2026-09-13)
 */
public class AngleCalculator 
{
    /**
     * Main behavior of the program. Run with command line arguments.
     * 
     * Step 1: Write a description for args, which is an array (basically a list).
     *  Think about how many items need to be in args for the program to work.
     *  Also think about what they might represent, and what needs to be true about them.
     * 
     * @param args - TODO: FILL THIS IN WITH DETAILS ABOUT ARGS
     * 
     * Args is the inputs to our programs and there needs to be two inputs that are intergers.
     *
     */
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Invalid arguments, input be in the format:");
            System.out.println("\tjava AngleCalculator 30 1");
            System.out.println();
            System.out.println("Output format:");
            System.out.println("\t(0.8660254037844387 , 0.49999999999999994)");
            System.exit(0);
        }
        else
        {
            // Step 2: This code is difficult to read. Use context clues to determine
            //  what we could call these variables instead.

            // TODO: RENAME THESE VARIABLES
            double angle_degrees = Double.parseDouble(args[0]);
            double radius = Double.parseDouble(args[1]);
            
            // Step 3: Something is wrong with this calculation. Use the documentation
            //  for the Math class to determine what is wrong, and make the correction.

            // Hint: You can see the expected output above. Think about what might 
            //  result in those values.

            // TODO: FIX BUG WITH CALCULATION
            double x = radius * Math.cos(Math.toRadians(angle_degrees));
            double y = radius * Math.sin(Math.toRadians(angle_degrees));

            System.out.print("(");
            System.out.print(x);
            System.out.print(" , ");
            System.out.print(y);
            System.out.println(")");
        }
    }
}
