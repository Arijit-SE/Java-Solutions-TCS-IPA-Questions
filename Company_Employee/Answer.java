package Company_Employee;
import java.util.*;
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String cn = sc.nextLine();
        System.out.print("Enter number of employees: ");
        int num = sc.nextInt();sc.nextLine();
        Employee[] emp = new Employee[num];
        System.out.println("Enter employee details: ");
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee "+(i+1)+":");

            System.out.print("Enter id: ");
            int a = sc.nextInt();sc.nextLine();

            System.out.print("Enter name: ");
            String b = sc.nextLine();

            System.out.print("Enter designation: ");
            String c = sc.nextLine();

            System.out.print("Enter salary: ");
            double d = sc.nextDouble();sc.nextLine();

            emp[i] = new Employee(a,b,c,d);
        }
        Company com = new Company(cn,emp,num);
    
        System.out.println("Average Salary : "+com.getAverageSalary(emp));
        System.out.println("Max Salary : "+com.getMaxSalary(emp));

        System.out.print("Enployee with Designation: ");
        String desi = sc.nextLine();
        Employee[] ans = com.getEmployeesByDesignation(emp,desi);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println("ID: "+ans[i].getId()+", Name: "+ans[i].getName()+", Designation: "+ans[i].getDes()+", Salary: "+ans[i].getSalary());
            }
        }
    }
}

class Employee
{
    private int id;
    private String name;
    private String des;
    private double salary;
    public Employee(int id, String name, String des, double salary) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Company
{
    private String comName;
    private Employee[] emp;
    private int numEmp;
    public Company(String comName, Employee[] emp, int numEmp) {
        this.comName = comName;
        this.emp = emp;
        this.numEmp = numEmp;
    }
    public double getAverageSalary(Employee[] e)
    {
        double sum = 0;
        for(int i=0; i<e.length; i++)
        {
            sum+=e[i].getSalary();
        }
        if(sum>0)
        {
            double avg = sum/e.length;
            return avg;
        }
        return 0;
    }

    public double getMaxSalary(Employee[] e)
    {
        double maxSal=e[0].getSalary();
        for(int i=0; i<e.length; i++)
        {
            if(maxSal<e[i].getSalary())
            {
                maxSal = e[i].getSalary();
            }
        }
        return maxSal;
    }

    public Employee[] getEmployeesByDesignation(Employee[]e,String d)
    {
        Employee[] emp = new Employee[0];
        for (int i = 0; i < e.length; i++) {
            if(e[i].getDes().equalsIgnoreCase(d))
            {
                emp = Arrays.copyOf(emp,emp.length+1);
                emp[emp.length-1] = e[i];
            }
        }
        if(emp.length>0)
        {
            return emp;
        }
        return null;
    }
}