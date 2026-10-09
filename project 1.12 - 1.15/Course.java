public class Course {
    private String courseName;
    private String teacherName;

    public Course(String c, String t)
    {
        courseName = c;
        teacherName = t;
    }

    public String toString()
    {
        return courseName + " - " + teacherName;
    }

}
