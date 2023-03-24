package IPA43;
import java.util.*;
public class IPA43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student[] s = new Student[4];
        for (int i = 0; i < s.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            int f = sc.nextInt();sc.nextLine();
            double g = sc.nextDouble();sc.nextLine();

            s[i] = new Student(a,b,c,d,e,f,g);
        }
        String course = sc.nextLine();
        double ans1 = calculateAverageGPA(s);
        if(ans1 != 0)
        {
            System.out.printf("%.1f",ans1);
            System.out.println();
        }
        else
        {
            System.out.println("Sorry - No students are available");
        }
        Student[] ans2 = getStudentsByCourse(s, course);
        if(ans2 != null)
        {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getN());
                System.out.println(ans2[i].getR());
                System.out.println(ans2[i].getGpa());
            }
        }
        else
        {
            System.out.println("Sorry - No students are available for the given course");
        }
    }
    public static double calculateAverageGPA(Student[] s)
    {
        double sum = 0;
        int c=0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i].getGpa();
            c++;
        }
        if(c>0)
        {
            double avg = sum/c;
            return avg;
        }
        return 0;
    }
    public static Student[] getStudentsByCourse(Student[] s, String c)
    {
        Student[] arr = new Student[0];
        for (int i = 0; i < s.length; i++) 
        {
            if(s[i].getC().equalsIgnoreCase(c))
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = s[i];
            }    
        }
        if(arr.length>0)
        {
            return arr;
        }
        return null;
    }
}
class Student
{
    String n, r;
    int a;
    char g;
    String c;
    int s;
    double gpa;
    public Student(String n, String r, int a, char g, String c, int s, double gpa) {
        this.n = n;
        this.r = r;
        this.a = a;
        this.g = g;
        this.c = c;
        this.s = s;
        this.gpa = gpa;
    }
    public String getN() {
        return n;
    }
    public void setN(String n) {
        this.n = n;
    }
    public String getR() {
        return r;
    }
    public void setR(String r) {
        this.r = r;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public char getG() {
        return g;
    }
    public void setG(char g) {
        this.g = g;
    }
    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}