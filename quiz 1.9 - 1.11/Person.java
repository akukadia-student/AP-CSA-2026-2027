public class Person {
    // each person has a name
    private String name;

    // Special constructor method to make a new person with a name
    public Person(String initialName)
    {
        name = initialName;
    }

    // method to change name
    public void setName(String newName)
    {
        name = newName;
    }

    // method to get my name
    public String getName() {
        return name;
    }
}
