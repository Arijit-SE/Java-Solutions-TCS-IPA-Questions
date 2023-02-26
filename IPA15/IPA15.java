package IPA15;
import java.util.*;
public class IPA15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] ph = new Phone[4];
        for (int i = 0; i < ph.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            ph[i] = new Phone(a,b,c,d);
        }
        String br = sc.nextLine();
        String os = sc.nextLine();
        int ans1 = findPriceForGivenBrand(ph,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("The brand is not available");
        }

        int ans2 = getPhoneIdBasedOnOs(ph,os);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("No phones are available with specified os and price range");
        }
    }
    public static int findPriceForGivenBrand(Phone[] p, String br)
    {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].getBrand().equalsIgnoreCase(br))
            {
                sum += p[i].getPrice();
            }
        }
        return sum;   
    }
    public static int getPhoneIdBasedOnOs(Phone[] p,String os)
    {
        for (int i = 0; i < p.length; i++) {
            if(p[i].getOs().equalsIgnoreCase(os) && p[i].getPrice()>=50000)
            {
                return p[i].getId();
            }
        }
        return 0;
    }
}
class Phone
{
    int id,price;
    String os,brand;

    public Phone(int id, String os, String brand, int price)
    {
        this.id = id;
        this.os = os;
        this.brand=brand;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getOs()
    {
        return os;
    }
    public void setOs(String os)
    {
        this.os = os;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}