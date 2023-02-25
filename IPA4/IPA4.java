package IPA4;
import java.util.*;
public class IPA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        College[] college = new College[n];

        for (int i=0; i<n; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            college[i]= new College(a,b,c,d,e);
        }

        String address = sc.nextLine();
        College pin = findCollegeWithMaximumPincode(college);
        if(pin!=null)
        {
            System.out.println("ID : "+pin.getId());
            System.out.println("Name : "+pin.getName());
            System.out.println("Contact No : "+pin.getContactNo());
            System.out.println("Address : "+pin.getAddress());
            System.out.println("Pin : "+pin.getPin());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }

        College add = searchCollegeByAddress(college,address);
        if(add!=null)
        {
            System.out.println("ID : "+add.getId());
            System.out.println("Name : "+add.getName());
            System.out.println("Contact No : "+add.getContactNo());
            System.out.println("Address : "+add.getAddress());
            System.out.println("Pin : "+add.getPin());
        }
        else{
            System.out.println("No college found with mentioned attribute");
        }
    }
    public static College findCollegeWithMaximumPincode(College[] college)
    {
        int max = 0;
        for(int i =0; i<college.length; i++)
        {
            if(college[i].getPin()>max)
            {
                max = college[i].getPin();
            }
        }
        for(int i=0; i<college.length; i++)
        {
            if(college[i].getPin()==max)
            {
                return college[i];
            }
        }
        return null;
    }
    public static College searchCollegeByAddress(College[] college,String add)
    {
        for(int i=0; i<college.length; i++)
        {
            if(college[i].getAddress().equalsIgnoreCase(add))
            {
                return college[i];
            }
        }
        return null;
    }
}
class College
{
    int id, contactNo, pin;
    String name, address;

    public College(int id, String name, int contactNo, String address, int pin)
    {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pin = pin;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getContactNo()
    {
        return contactNo;
    }
    public void setContactNo(int contactNo)
    {
        this.contactNo = contactNo;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public int getPin()
    {
        return pin;
    }
    public void setPin(int pin)
    {
        this.pin= pin;
    }
}
