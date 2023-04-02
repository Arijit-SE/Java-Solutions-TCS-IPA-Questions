package IPA52;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];
        for (int i = 0; i < emp.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            emp[i] = new Employee(a,b,c,d,e);
        }
        int sal = sc.nextInt();sc.nextLine();
        String dept = sc.nextLine();
        String[] ans1 = findDept(emp,sal);
        if(ans1!=null)
        {
            String dep = Arrays.toString(ans1);
            String de = dep.substring(1,dep.length()-1);
            System.out.println(de);
        }
        else
        {
            System.out.println("No Department found");
        }
        int ans2 = findSecondHighestSalary(emp,dept);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("No data found");
        }
    }
    public static String[] findDept(Employee[] e, int s)
    {
        String[] d = new String[0];
        for (int i = 0; i < e.length; i++) {
            if(e[i].getSalary()==s && e[i].getRating()>=3)
            {
                d = Arrays.copyOf(d,d.length+1);
                d[d.length-1] = e[i].getDept();
            }
        }
        if(d.length>0)
        {
            return d;
        }
        return null;
    }
    public static int findSecondHighestSalary(Employee[] e, String d)
    {
        int[] sal = new int[0];
        for (int i = 0; i < e.length; i++) {
            if(e[i].getDept().equalsIgnoreCase(d))
            {
                sal = Arrays.copyOf(sal, sal.length+1);
                sal[sal.length-1] = e[i].getSalary();
                Arrays.sort(sal);
            }
        }
        if(sal.length>0)
        {
            for (int i = 0; i < sal.length; i++) {
                if(sal[i]<sal[i+1])
                {
                    return sal[i];
                }
            }
        }
        return 0;
    }
}
class Employee
{
    int id, rating, salary;
    String name, dept;
    public Employee(int id, String name, String dept, int rating, int salary) {
        this.id = id;
        this.rating = rating;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    
}