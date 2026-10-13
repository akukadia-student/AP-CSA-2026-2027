public class Person {
    protected String firstName;
    protected String lastName;
    protected String emailAddress;

    public Person()
    {
        // does nothing, subclass will implement
    }

    public Person(String fN, String lN, String email)
    {
        firstName = fN;
        lastName = lN;
        emailAddress = email;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getEmail()
    {
        return emailAddress;
    }

    public String toString()
    {
        return getFullName() + " (" + emailAddress + ")";
    }
}
