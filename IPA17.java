import java.util.*;
public class IPA17 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[4];
        for (int i = 0; i < s.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();

            s[i] = new Student(a,b,c,d,e);
        }
        char g = sc.nextLine().charAt(0);
        int m = sc.nextInt();sc.nextLine();
        Student[] ans1 = findStudentByGradeAndMonth(s,g,m);
        if(ans1!=null)
        {
            for (int i = 0; i < ans1.length; i++) 
            {
                System.out.println(ans1[i].getName());
                System.out.println(ans1[i].getSub());
            }
            System.out.println(ans1.length);
        }
        else
        {
            System.out.println("No student found");
        }
    }
    public static Student[] findStudentByGradeAndMonth(Student[]s, char g, int m)
    {
        Student[] arr = new Student[0];
        String month = Integer.toString(m);
        for (int i = 0; i < s.length; i++) {
            if(s[i].getGrade()==g && s[i].getDate().contains(month))
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = s[i];
            }
        }
        Student data;
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i].getRoll()>arr[j].getRoll())
                {
                    data = arr[i];
                    arr[i]=arr[j];
                    arr[j]=data;
                }
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        else
        {
            return null;
        }
    }
}
class Student
{
    private int roll;
    private String name;
    private String sub;
    private String date;
    private char grade;

    public Student(int roll, String name, String sub, char grade, String date)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.date = date;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}