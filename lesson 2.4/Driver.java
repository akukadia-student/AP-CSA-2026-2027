public class Driver {
    public static void main(String[] args) {
        int score;
        double gpa;
        score = 22;
        if (score >= 90)
        {
            gpa = 4.0;
        }
        else if (score >= 86) 
        {
            gpa = 3.5;
        }
        else if (score >= 80) 
        {
            gpa = 3.0;
        }
        else if (score >= 76) 
        {
            gpa = 2.5;
        }
        else if (score >= 70) 
        {
            gpa = 2.0;
        }
        else if (score >= 60) 
        {
            gpa = 1.0;
        }
        else
        {
            gpa = 0;
        }
        System.out.println(gpa);
    }
}
