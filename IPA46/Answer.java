package IPA46;
import java.util.*;
public class Answer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] p = new Player[4];
        for (int i = 0; i < p.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();    
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            
            p[i] = new Player(a,b,c,d);
        }
        String s = sc.nextLine();
        int[] ans = searchPlayerForMatch(p,s);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }
        else
        {
            System.out.println("NA");
        }
    }
    public static int[] searchPlayerForMatch(Player[] p, String s)
    {
        int[] id = new int[0];
        for (int i = 0; i < p.length; i++) {
            if(p[i].getSide().equalsIgnoreCase(s))
            {
                id = Arrays.copyOf(id,id.length+1);
                id[id.length-1] = p[i].getId();
                Arrays.sort(id);
            }
        }
        if(id.length>0)
        {
            return id;
        }
        else
        {
            return null;
        }
    }
}
class Player
{
    int id;
    String country,side;
    double price;
    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}