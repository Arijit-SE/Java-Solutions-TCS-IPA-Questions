package IPA27;
import java.util.*;
public class IPA27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim2[] s = new Sim2[4];
        for (int i = 0; i < s.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            s[i] = new Sim2(a,b,c,d,e);
        }
        String cir = sc.nextLine();
        double rate = sc.nextDouble();sc.nextLine();
        Sim2[] ans = matchAndSort(s,cir,rate);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getId());
            }
        }
        else
        {
            System.out.println();
        }
    }
    public static Sim2[] matchAndSort(Sim2[] s, String c, double r)
    {
        Sim2[] id = new Sim2[0];
        for (int i = 0; i < s.length; i++) {
            if(s[i].getCircle().equalsIgnoreCase(c) && r>s[i].getRps())
            {
                id = Arrays.copyOf(id, id.length+1);
                id[id.length-1] = s[i];
            }
        }
        if(id.length>0)
        {
            for (int i = 0; i < id.length-1; i++) 
            {
                for (int j = i+1; j < id.length; j++)
                {
                    if(id[i].getBalance()<id[j].getBalance())
                    {
                        Sim2 bal = id[i];
                        id[i] = id[j];
                        id[j] = bal;
                    }
                }   
            }

            return id;
        }
        else
        {
            return null;
        }
    }
}
class Sim2
{
    private int id;
    private String company;
    private int balance;
    private double rps;
    private String circle;
    public Sim2(int id, String company, int balance, double rps, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.rps = rps;
        this.circle = circle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getRps() {
        return rps;
    }
    public void setRps(double rps) {
        this.rps = rps;
    }
    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }

    
}