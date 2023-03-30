import java.util.*;
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Beach[] bc = new Beach[4];
        for (int i = 0; i < bc.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            bc[i] = new Beach(a,b,c,d);
        }
        String e = sc.nextLine();
        int f = sc.nextInt();
        int ans = findLeastRatingWithName(bc,e,f);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("No beach found");
        }

    }
    public static int findLeastRatingWithName(Beach[] bc, String e, int f)
    {
        int[] rate = new int[0];
        for (int i = 0; i < bc.length; i++) {
            if(bc[i].getName().equalsIgnoreCase(e) && bc[i].getCost()>f)
            {
                rate = Arrays.copyOf(rate, rate.length+1);
                rate[rate.length-1] = bc[i].getRating();
                Arrays.sort(rate);
            }
        }
        if(rate.length>0)
        {
            return rate[0];
        }
        return 0;
    }
}
class Beach
{
    private int id;
    private String name;
    private int rating;
    private int cost;
    public Beach(int id, String name, int rating, int cost) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.cost = cost;
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
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}