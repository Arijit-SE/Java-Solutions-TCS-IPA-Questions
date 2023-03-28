package IPA50;
import java.util.*;
public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Employee[] emp = new Employee[n];
            for(int i=0; i<n; i++)
            {
                int a = sc.nextInt();sc.nextLine();
                String b = sc.nextLine();
                int c = sc.nextInt();sc.nextLine();
                char d = sc.next().charAt(0);sc.nextLine();
                double e = sc.nextDouble();sc.nextLine();

                emp[i] = new Employee(a,b,c,d,e);
            }
        int age = sc.nextInt();
        Employee[] ans1 = getEmployeeWithSecondLowestSalary(emp);
        if(ans1!=null)
        {
            for(int i=0; i<ans1.length; i++)
            {
                System.out.println(ans1[i].getId()+"#"+ans1[i].getName());
            }
        }
        else
        {
            System.out.println("Null");
        }
        int ans2 = countEmployeesBasedOnAge(emp,age);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("No employee found for the given age");
        }
    }
    public static Employee[] getEmployeeWithSecondLowestSalary(Employee[] e)
    {
        Employee[] det = new Employee[0];
        if(e.length>1)
        {
            for(int i=0; i<e.length; i++)
            {
                for(int j=i; j<e.length; j++)
                {
                    if(e[i].getSalary()>e[j].getSalary())
                    {
                        Employee k = e[i];
                        e[i] = e[j];
                        e[j] = k;
                    }
                }
            }
            Employee min = e[0];
            for(int i=0; i<e.length; i++)
            {
                if(e[i].getSalary()>e[0].getSalary())
                {
                    det = Arrays.copyOf(det, det.length+1);
                    det[det.length-1] = e[i];
                    break;
                }
            }
            for(int i=0; i<e.length; i++)
            {
                if(det[0].getSalary() == e[i].getSalary() && e[i].getId()!=det[0].getId())
                {
                    det = Arrays.copyOf(det, det.length+1);
                    det[det.length-1] = e[i];
                }
            }
            return det;
        }        
        return null;    
    }
    public static int countEmployeesBasedOnAge(Employee[] e, int a)
    {
        int count = 0;
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getAge()==a)
            {
                count++;
            }
        }
        return count;
    }
}
class Employee
{
    private int id;
    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(int id, String name, int age, char gender, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public char getGender()
    {
        return this.gender;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}