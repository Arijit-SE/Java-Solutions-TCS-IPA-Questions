package IPA53;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] co = new Course[4];
        for (int i = 0; i < co.length; i++) {
            String a = sc.nextLine();
            int b = Integer.parseInt(sc.nextLine());
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            co[i] = new Course(a,b,c,d);
        }
        String name = sc.nextLine();
        String status = findCourseStatus(co,name);
        if(status!=null)
        {
            System.out.println(status);
        }
        else
        {
            System.out.println("No course found");
        }
    }
    public static String findCourseStatus(Course[] c, String n)
    {
        for (int i = 0; i < c.length; i++) {
            if(c[i].getName().equalsIgnoreCase(n))
            {
                if(c[i].getNumber()>=1000)
                {
                    return "High";
                }
                else if(c[i].getNumber()>=500 && c[i].getNumber()<1000)
                {
                    return "Medium";
                }
                else
                {
                    return "Low";
                }
            }
        }
        return null;
    }
}
class Course
{
    String name, mode;
    int number;
    boolean data;
    public Course(String name, int number,String mode, boolean data) {
        this.name = name;
        this.mode = mode;
        this.number = number;
        this.data = data;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isData() {
        return data;
    }
    public void setData(boolean data) {
        this.data = data;
    }
    
}