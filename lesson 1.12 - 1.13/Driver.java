public class Driver {
    public static void main(String[] args) {
        FoodItem whitebread = new FoodItem("whitebread", 24, 75);
        FoodItem apple = new FoodItem("apple", 95);
        FoodItem orange = new FoodItem("orange", 54);
        FoodItem apple2 = apple;
        System.out.println(whitebread);
        System.out.println(apple);
        System.out.println(orange);
        System.out.println(apple2);
        /*FoodItem@372f7a8d
        FoodItem@2f92e0f4
        FoodItem@28a418fc
        FoodItem@2f92e0f4 
        Second and Forth Same
        */
    }
}
