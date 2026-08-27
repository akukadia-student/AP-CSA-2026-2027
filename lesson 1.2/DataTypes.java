public class DataTypes
{
    public static void main(String[] args) 
    {
        int count;

        int numStudentsInClass;

        count = 3;

        System.out.println(count);

        // causes compile time error - not initialized
        // System.out.println(numStudentsInClass);

        // causes compile time error - invalid data type
        // count = 3.5;

        boolean hasTakenAttendance = true;

        hasTakenAttendance = false;

        final double pi = 3.14;

        // causes compile time error - cannot modify final variables
        // pi = 2.5;
    }
}