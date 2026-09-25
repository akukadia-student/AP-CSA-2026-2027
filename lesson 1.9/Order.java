public class Order
{
    public static void main(String[] args) 
    {
        // Step 2: Call your scoring method with three different scores.
        //  One homework assignment with a total 20 points and a score of 18.
        //  One quiz with a total of 15 points and a score of 14.
        //  One test with a total of 30 points and a score 29.
        double one = points(18, 20);
        double two = points(14, 15);
        double three = points(29, 30);
        // Step 4: Call your weighting method with the scores from the three assignments.
        System.out.println(weighted(one, two, three));
    }

    // Step 1: Write a method to calculate the percentage score on an assessment.
    //  You will need to take inputs for the points earned and total points.
    //  Your method should return the score as a percentage, and it should support decimals.

    public static double points(int earned, int total)
    {
        return (earned/(double)total)*100;
    }

    // Step 3: Write a method to calculate the weighted average of the homework, quiz, and test score.
    //  The homework is 20%, quiz is 30%, and test is 50%.
    //  Your method should return the score as a percentage, and it should round to the nearest integer. 

    public static double weighted(double homework, double quiz, double test)
    {
        return (homework*0.2) + (quiz * 0.3) + (test*0.5);
    }
}