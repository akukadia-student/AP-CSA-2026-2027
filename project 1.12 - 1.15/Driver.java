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
        Student s2 = new Student("Amaan", "Lakhani", 23);

        s1.setCourseA(course1);
        s1.setCourseB(course2);
        s1.setCourseC(course3);
        s1.printSchedule();
        System.out.println(s1.toString());

        System.out.println(s1.getFullName());

        Person p1 = new Person("Dave", "Marley", "Dave.Marley@gmail.com");
        s1.addParent(p1);
        System.out.println(p1);

        // polymorphism
        Person[] family = new Person[3];
        family[0] = p1;
        family[1] = s1;
        family[2] = s2;

        System.out.println("The family is: ");
        for (Person p : family)
        {
            System.out.println(p);
        }
    }
}
