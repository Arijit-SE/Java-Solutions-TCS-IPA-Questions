package IPA32;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] ta = new TravelAgencies[3];
        for(int i =0; i<3; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            boolean e = sc.nextBoolean();

            ta[i] = new TravelAgencies(a,b,c,d,e);
        }

        int res1 = findAgencyWithHighestPackagePrice(ta);
        System.out.println(res1);
        int regNo = sc.nextInt();sc.nextLine();
        String packageType = sc.nextLine();
        sc.close();
        TravelAgencies res2 = agencyDetailsForGivenIdAndType(ta,regNo,packageType);
        if(res2!=null)
        {
            System.out.println(res2.getAgencyName()+":"+res2.getPrice());
        }
        
    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] ta)
    {
        int max = 0;
        for(int i=0; i<ta.length; i++)
        {
            if(ta[i].getPrice()>max)
            {
                max = ta[i].getPrice();
            }
        }
        if(max>0)
        {
            return max;
        }
        else
        {
            return 0;
        }
    }
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] ta, int reg, String pt)
    {
        for(int i=0; i<ta.length; i++)
        {
            if(ta[i].getFlightFacility()==true && ta[i].getRegno()==reg && ta[i].getPackageType()==pt)
            {
                return ta[i];
            }
        }
        return null;
    }
}
class TravelAgencies
{
    int regno;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
// constructor
    public TravelAgencies(int regno, String agencyName, String packageType, int price, boolean flightFacility)
    {
        this.regno = regno;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
// getter method, setter method
    public int getRegno()
    {
        return regno;
    }
    public void setRegno(int regno)
    {
        this.regno = regno;
    }
    public String getAgencyName()
    {
        return agencyName;
    }
    public void setAgencyName(String agencyName)
    {
        this.agencyName = agencyName;
    }
    public String getPackageType()
    {
        return packageType;
    }
    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public boolean getFlightFacility()
    {
        return flightFacility;
    }
    public void setFlightFacility(boolean flightFacility)
    {
        this.flightFacility = flightFacility;
    }
}
