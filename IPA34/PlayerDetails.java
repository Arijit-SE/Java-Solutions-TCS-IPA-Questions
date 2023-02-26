package IPA34;
import java.util.*;
public class PlayerDetails 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player3[] pl = new Player3[n];
        for (int i = 0; i < pl.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            pl[i] = new Player3(a,b,c,d,e);
        }
        String con = sc.nextLine();
        int r = sc.nextInt(); 
        Player3[] ans = findPlayerName(pl, con, r);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length-1; i++) 
            {
                for (int j = i+1; j < ans.length; j++) 
                {
                    if(ans[i].getName().compareTo(ans[j].getName())>0)
                    {
                        Player3 name = ans[i];
                        ans[i] = ans[j];
                        ans[j] = name;
                    }
                }
            }
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getId()+":"+ans[i].getName());
            }
        }
        else
        {
            System.out.println("No player found");
        }
    }    
    public static Player3[] findPlayerName(Player3[] p, String c, int r)
    {
        Player3[] arr = new Player3[0];
        for (int i = 0; i < p.length; i++) {
            if(p[i].getCountry().equalsIgnoreCase(c) && p[i].getRun()>r)
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = p[i];
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        else
        {
            return null;
        }
    }
}
class Player3
{
    private int id;
    private String name;
    private String country;
    private int match;
    private int run;
    public Player3(int id, String name, String country, int match, int run) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.match = match;
        this.run = run;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getMatch() {
        return match;
    }
    public void setMatch(int match) {
        this.match = match;
    }
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    
}