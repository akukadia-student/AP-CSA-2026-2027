public class Student
{
    private String firstName, lastName, emailAddress;
    private int startYear, graduationYear;
    private Course periodA, periodB, periodC;

    public Student(String email)
    {
        emailAddress = email;
        int dot = email.indexOf(".");
        firstName = email.substring(0, dot);
        System.out.println(firstName);
        lastName = email.substring(dot + 1, dot);
    }
}