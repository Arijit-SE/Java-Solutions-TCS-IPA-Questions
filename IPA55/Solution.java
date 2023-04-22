package IPA55;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] rs = new Resort[4];
        for (int i = 0; i < rs.length; i++) {
            int a = Integer.parseInt(sc.nextLine());
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            double e = sc.nextDouble();sc.nextLine();

            rs[i] = new Resort(a,b,c,d,e);
        }
        String cat = sc.nextLine();
        double ans = findAvgPrice(rs,cat);
        if(ans!=0)
        {
            System.out.println("The average price of "+cat+":"+(int)ans);
        }
        else
        {
            System.out.println("No resorts are available");
        }
    }
    public static double findAvgPrice(Resort[] r, String s)
    {
        double sum = 0;
        int n = 0;
        for (int i = 0; i < r.length; i++) {
            if(r[i].getCat().equalsIgnoreCase(s) && r[i].getRate()>4)
            {
                sum += r[i].getPrice();
                n++;
            }
        }
        if(n>0)
        {
            double avg = sum/n;
            return avg;
        }
        return 0;
    }
}
class Resort
{
    private int id;
    private String name;
    private String cat;
    private double price;
    private double rate;
    public Resort(int id, String name, String cat, double price, double rate) {
        this.id = id;
        this.name = name;
        this.cat = cat;
        this.price = price;
        this.rate = rate;
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
    public String getCat() {
        return cat;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    
}