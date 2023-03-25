    package IPA45;

    import java.util.Scanner;

    public class Solution {
        
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            String n = sc.nextLine();
            int a = sc.nextInt();
            double s = sc.nextDouble();

            Employee e = new Employee(n,a,s);

            double yearlySalary = calculateYearlySalary(e);
            double tax = calculateTax(e);
            
            if(yearlySalary != 0 && tax != 0)
            {
                System.out.println("Yearly salary of "+e.getName()+": "+yearlySalary);
                System.out.println("Tax to be paid by "+e.getName()+": "+tax);
            }
        }
        
        public static double calculateYearlySalary(Employee emp) 
        {
            if (emp.getSalary() > 0) 
            {
                return emp.getSalary() * 12;
            }
            return 0;
        }
        
        public static double calculateTax(Employee emp) 
        {
            double yearlySalary = calculateYearlySalary(emp);
            double tax = 0;
            if (yearlySalary > 0) {
                if (yearlySalary <= 50000) 
                {
                    tax = yearlySalary * 0.10;
                } 
                else if (yearlySalary <= 100000 && yearlySalary>50000) 
                {
                    tax = (50000 * 0.10) + ((yearlySalary - 50000) * 0.20);
                } 
                else 
                {
                    tax = (50000 * 0.10) + (50000 * 0.20) + ((yearlySalary - 100000) * 0.30);
                }
            }
            return tax;
        }
    }

    class Employee {
        
        private String name;
        private int age;
        private double salary;
        
        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        
    }
