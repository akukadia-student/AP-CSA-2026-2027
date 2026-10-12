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
        int at = email.indexOf("@");
        lastName = email.substring(dot + 1, at - 2);
        graduationYear = Integer.parseInt(email.substring(at - 2, at));     
        startYear = graduationYear - 4;
    }

    public Student(String fN, String lN, int sY)
    {
        firstName = fN;
        lastName = lN;
        startYear = sY;
        graduationYear = sY + 4;
        emailAddress = fN + "." + lN + graduationYear + "@pallottihs.info";
    }

    public String getEmail()
    {
        return emailAddress;
    }

    public int getGraduationYear()
    {
        return graduationYear;
    }

    public void setGraduationYear(int gY)
    {
        graduationYear = gY;
    }

    public void setCourseA(Course c)
    {
        periodA = c;
    }

    public void setCourseB(Course c)
    {
        periodB = c;
    }

    public void setCourseC(Course c)
    {
        periodC = c;
    }

    public void printSchedule()
    {
        System.out.println("Schedule: ");
        System.out.println("A: " + periodA);
        System.out.println("B: " + periodB);
        System.out.println("C: " + periodC);
    }
    public String toString()
    {
        return firstName + " " + lastName + " Class of " + graduationYear;
    }
}