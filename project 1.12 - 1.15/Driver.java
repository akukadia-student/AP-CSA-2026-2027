public class Driver {
    public static void main(String[] args) 
    {
        Course course1 = new Course("APCSA", "Mr. Merritt");
        Course course2 = new Course("APBio", "Mr. Grenchik");
        Course course3 = new Course("HWindE", "Mr. I");

        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());

        Student s1 = new Student("arkin.kukadia27@pallottihs.info");

    }
}
