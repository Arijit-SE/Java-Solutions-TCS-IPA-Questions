package IPA36;
import java.util.*;
public class Mobile {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MobileDetails[] mb = new MobileDetails[5];
        for (int i = 0; i < mb.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            mb[i] = new MobileDetails(a, b, c, d);
        }
        String br = sc.nextLine();
        int ans1 = getTotalPrice(mb,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("There are no mobile with given brand");
        }
        MobileDetails[] ans2 = getSecondMin(mb);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getBrand()+":"+ans2[i].getPrice());
            }
        }
        else
        {
            System.out.println("Prices are same");
        }
    }
    public static int getTotalPrice(MobileDetails[] m, String b)
    {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i].getBrand().equalsIgnoreCase(b))
            {
                sum += m[i].getPrice();
            }
        }
        if(sum>0)
        {
            return sum;
        }
        return 0;
    }
    public static MobileDetails[] getSecondMin(MobileDetails[] m)
    {
        MobileDetails[] arr = new MobileDetails[0];
        
        for (int i = 0; i < m.length-1; i++) 
        {
            for (int j = i+1; j < m.length; j++) 
            {
                if(m[i].getPrice() > m[j].getPrice())
                {
                    MobileDetails k = m[i];
                    m[i] = m[j];
                    m[j] = k;
                }
            }
        }
        
        for (int i = 1; i < m.length; i++) {
            if(m[0].getPrice()<m[i].getPrice())
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = m[i];
                break;
            }
        }
        for (int j = 0; j < m.length; j++) 
        {
            if(arr[0].getPrice()==m[j].getPrice() && arr[0].getId()!=m[j].getId()) 
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = m[j];
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        return null;
    } 
}
class MobileDetails
{
    private int id;
    private int price;
    private String brand;
    private boolean isFlagShip;
    
    public MobileDetails(int id, int price, String brand, boolean isFlagShip) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean isFlagShip() {
        return isFlagShip;
    }
    public void setFlagShip(boolean isFlagShip) {
        this.isFlagShip = isFlagShip;
    }
    
}