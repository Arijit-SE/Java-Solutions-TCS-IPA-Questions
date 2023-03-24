package IPA42;
import java.util.*;
public class IPA42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] st = new Student[2];
        Faculty[] fa = new Faculty[2];
        for (int i = 0; i < st.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            int g = sc.nextInt();sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            st[i] = new Student(a,b,c,d,e,f,g,h);
        }
        for (int j = 0; j < fa.length; j++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            String g = sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            fa[j] = new Faculty(a,b,c,d,e,f,g,h);
        }
        Student ans1 = findHighestGPAStudent(st);
        if(ans1!=null)
        {
            System.out.println(ans1.getRoll());
            System.out.println(ans1.getCourse());
            System.out.println(ans1.getGpa());
        }
        else
        {
            System.out.println("Sorry - No student is available");
        }

        Faculty ans2 = findHighestPaidFaculty(fa);
        if(ans2!=null)
        {
            System.out.println(ans2.getId());
            System.out.println(ans2.getDept());
            System.out.println(ans2.getSal());
        }
        else
        {
            System.out.println("Sorry - No faculty is available");
        }
    }
    public static Student findHighestGPAStudent(Student[] s)
    {
        Student h = s[0];
        for (int i = 0; i < s.length; i++) {
            if(s[i].getGpa()>h.getGpa())
            {
                h = s[i];
            }
        }
        if(h!=null)
        {
            return h;
        }
        return null;
    }
    public static Faculty findHighestPaidFaculty(Faculty[] f)
    {
        Faculty h = f[0];
        for (int i = 0; i < f.length; i++) {
            if(f[i].getSal()>h.getSal())
            {
                h = f[i];
            }
        }
        if(h !=null)
        {
            return h;
        }
        return null;
    }
}
class Person
{
    String fn, ln;
    int age;
    char gen;
    public Person(String fn, String ln, int age, char gen) {
        this.fn = fn;
        this.ln = ln;
        this.age = age;
        this.gen = gen;
    }
    public String getFn() {
        return fn;
    }
    public void setFn(String fn) {
        this.fn = fn;
    }
    public String getLn() {
        return ln;
    }
    public void setLn(String ln) {
        this.ln = ln;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGen() {
        return gen;
    }
    public void setGen(char gen) {
        this.gen = gen;
    }   
}
class Student extends Person
{
    String roll, course;
    int sem;
    double gpa;
    public Student(String fn, String ln, int age, char gen, String roll, String course, int sem, double gpa) {
        super(fn, ln, age, gen);
        this.roll = roll;
        this.course = course;
        this.sem = sem;
        this.gpa = gpa;
    }
    public String getRoll() {
        return roll;
    }
    public void setRoll(String roll) {
        this.roll = roll;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
class Faculty extends Person
{
    String id, dept, des;
    double sal;
    public Faculty(String fn, String ln, int age, char gen, String id, String dept, String des, double sal)
    {
        super(fn, ln, age, gen);
        this.id = id;
        this.dept = dept;
        this.des = des;
        this.sal = sal;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }  
}
