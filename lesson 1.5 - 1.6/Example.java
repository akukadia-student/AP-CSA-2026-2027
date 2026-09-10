public class Example
{
    public static void main(String[] args)
    {
        int coins = 0;
        // add the previous value of coins and 1,
        //  then store that new value back in coins
        coins = coins + 1;

        int score = 100;
        score = score + 10;


        double health = 50.0;
        health = health - 25;


        System.out.println(coins);

        // increment - add one
        coins++;
        coins--;

        System.out.println(coins);

        // add or subtract more than one at a time
        score += 10;
        health -= 25;
        
        // always a shortcut for:
        //      variable (operator)= value;
        //      variable = variable (operator) value;
    }
}