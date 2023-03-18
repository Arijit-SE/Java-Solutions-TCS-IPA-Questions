package IPA39;
import java.util.*;
public class IPA39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veg[] v = new Veg[4];
        for (int i = 0; i < v.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            v[i] = new Veg(a,b,c,d);
        }
        int r = sc.nextInt();
        Veg ans = findMinimumPriceByRating(v,r);
        if(ans!=null)
        {
            System.out.println(ans.getId());
        }
        else
        {
            System.out.println("No such Vegetables");
        }
    }
    public static Veg findMinimumPriceByRating(Veg[] v, int r)
    {
        int[] arr = new int[0];
        for (int i = 0; i < v.length; i++) {
            if(v[i].getRating()>r)
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = v[i].getPrice();
                Arrays.sort(arr);
            }
        }
        if(arr.length>0)
        {
            for (int i = 0; i < v.length; i++) {
                if(v[i].getPrice()==arr[0])
                {
                    return v[i];
                }
            }
        }
        return null;
    }
}
class Veg
{
    private int id;
    private String name;
    private int price;
    private int rating;
    public Veg(int id, String name, int price, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    
}