public class FoodItem {
    private String name;
    private int servings;
    private int calories;

    public FoodItem(String n, int s, int c)
    {
        name = n;
        servings = s;
        calories = c;
    }

    public FoodItem(String n, int c)
    {
        name = n;
        calories = c;
    }
}
