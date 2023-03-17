package IPA38;
import java.util.*;
public class IPA38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] hs = new HeadSets[4];
        for (int i = 0; i < hs.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            hs[i] = new HeadSets(a,b,c,d);
        }
        String br = sc.nextLine();
        int ans1 = findTotalPriceForGivenBrand(hs,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("No Headsets available with the given brand");
        }
        HeadSets ans2 = findAvailableHeadsetWithSecondMinPrice(hs);
        if(ans2!=null)
        {
            System.out.println(ans2.getHname());
            System.out.println(ans2.getPrice());
        }
        else
        {
            System.out.println("No Headsets available");
        }
    }

    public static int findTotalPriceForGivenBrand(HeadSets[]h, String b)
    {
        int sum = 0;
        for (int i = 0; i < h.length; i++) {
            if(h[i].getBrand().equalsIgnoreCase(b))
            {
                sum += h[i].getPrice();
            }
        }
        return sum;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] h)
    {
        for (int i = 0; i < h.length-1; i++) {
            for (int j = i+1; j < h.length; j++) {
                if(h[i].getPrice()>h[j].getPrice())
                {
                    HeadSets k = h[i];
                    h[i] = h[j];
                    h[j] = k;
                }
            }
        }
        if(h[1].getAvailable()==true)
        {
            return h[1];
        }
        else
        {
            return null;
        }
    }
}
class HeadSets
{
    private String hname;
    private String brand;
    private int price;
    private boolean available;
    public HeadSets(String hname, String brand, int price,boolean available)
    {
        this.hname = hname;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    public String getHname()
    {
        return hname;
    }
    public void setHname(String hname)
    {
        this.hname = hname;
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
    public boolean getAvailable()
    {
        return available;
    }
    public void setAvailable(boolean available)
    {
        this.available = available;
    }
}