public class ClassDemo
{
    public static void main(String[] args) 
    {
        // Make a Thing to rate.
        Thing lunch = new Thing(4);

        // Reach into the lunch object and get the rating.
        System.out.println("The rating for lunch was: " + lunch.rating);

        // Normally, the class itself should
        //  handle its data.
        lunch.rating++;

        // Check the object again.
        System.out.println("The rating for lunch was: " + lunch.rating);
    }
}