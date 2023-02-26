package IPA17;
import java.util.*;
public class IPA17 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stu[] s = new Stu[4];
        for (int i = 0; i < s.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String t="",m="",y="";
            for(int j=0; j<e.length(); j++)
            {
                if(j<2)
                {
                    t = t+e.charAt(j);
                }
                else if(j>2 && j<5)
                {
                    m = m+e.charAt(j);
                }
                else if(j>5)
                {
                    y = y+e.charAt(j);
                }
            }

            s[i] = new Stu(a,b,c,d,t,m,y);
        }
        char g = sc.nextLine().charAt(0);
        int m = sc.nextInt();sc.nextLine();
        Stu[] ans1 = findStudentByGradeAndMonth(s,g,m);
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
    public static Stu[] findStudentByGradeAndMonth(Stu[]s, char g, int m)
    {
        Stu[] arr = new Stu[0];
        for (int i = 0; i < s.length; i++) {
            int mon = Integer.parseInt(s[i].getMonth());
            if(s[i].getGrade()==g && mon == m)
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = s[i];
            }
        }
        Stu data;
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
class Stu
{
    private int roll;
    private String name;
    private String sub;
    private String day;
    private String month;
    private String year;
    private char grade;

    public Stu(int roll, String name, String sub, char grade, String day, String month, String year)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.day = day;
        this.month = month;
        this.year =year;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth()
    {
        return month;
    }
    public void setMonth(String month)
    {
        this.month = month;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}