public class Demo
{
    public static void main(String[] args) {
        // Pass-by-value demonstration of creating a copy of the
        //  argument.
        // int number = 10;
        // System.out.println("The value of number is: " + number);
        // square(number);
        // System.out.println("The value of number is: " + number);

        // This works differently for references, because a copy
        //  of the reference still points to the original object.
        // Imagine if someone told everyone a copy of your phone
        //  number. Even though it was a copy, it still leads to 
        //  back to you.
        Person teacher = new Person("Mr. Merritt");
        System.out.println(teacher.getName());
        changeName(teacher);
        System.out.println(teacher.getName());
    }

    public static int square(int x)
    {
        x = x * x;
        return x;
    }

    public static void changeName(Person p)
    {
        // DESTRUCTION OF PERSISTENT DATA
        // p.setName("Matthew");

        // CREATING A COPY OF THE OBJECT BEFORE MODIFYING
        Person copy = new Person(p.getName());
        copy.setName("Matthew");
    }
}