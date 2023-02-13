import java.util.*;
public class IPA_practice3 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] ta = new TravelAgencies[5];
        for(int i=0; i<ta.length; i++)
        {
            int reg = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            ta[i] = new TravelAgencies(reg,name,packageType,price,flightFacility);
        }
        int getReg = sc.nextInt();
        sc.nextLine();
        String getPackageType = sc.nextLine();

        int highPack =  findAgencyHighPackagePrice(ta);
        System.out.println(highPack);

        TravelAgencies trav = agencyDetails(ta,getReg,getPackageType);
        
        if(trav == Null)
        {
            System.out.println("No data found");
        }
        else{
            System.out.println(trav.getname()+":"+trav.getprice());
        }
    }
    public static int findAgencyHighPackagePrice(TravelAgencies[] agencies)
    {
        int maxPrice = agencies[0].getPrice();
        for(int i = 1; i<agencies.length; i++)
        {
            if (agencies[i].getPrice()>maxPrice)
            {
                maxPrice = agencies[i].getPrice();
            }
        }
        return maxPrice;
    }
    public static int agencyDetails(TravelAgencies[] agencies, int regNo, String PackageType)
    {
        for(int i = 0; i<agencies.length; i++)
        {
            if(agencies[i].getFlightFacility())
            {
                if(agencies[i].getRegNo() == regNo && PackageType.equalsIgnoreCase(agencies[i].getPackagetype()))
                {
                    return agencies[i];
                }
            }
        }
        return null;
    }
    class TravelAgencies
    {
        int regNo;
        String Agencies;
        String PackageType;
        int price;
        boolean flightFacility;
    }
}
