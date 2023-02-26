package IPA25;
import java.util.*;
public class IPA25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema[] cn = new Cinema[4];
        for (int i = 0; i < cn.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            cn[i] = new Cinema(a, b, c, d);
        }
        String dir = sc.nextLine();
        int rate = sc.nextInt();sc.nextLine();
        int bud = sc.nextInt();sc.nextLine();

        int ans1 = findAvgBudgetByDirector(cn,dir);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        int ans2 =  getMovieByRatingBudget(cn, rate, bud);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }
    public static int findAvgBudgetByDirector(Cinema[] cn, String dir)
    {
        int sum = 0, count = 0;
        for (int i = 0; i < cn.length; i++) {
            if(cn[i].getDirector().equalsIgnoreCase(dir))
            {
                sum += cn[i].getBudget();
                count++;
            }
        }
        if(count>0)
        {
            int avg = sum/count;
            return avg;
        }
        else
        {
            return 0;
        }
    }
    public static int getMovieByRatingBudget(Cinema[] cn, int r, int b)
    {
        for (int i = 0; i < cn.length; i++) {
            if(cn[i].getBudget()==b && cn[i].getRating()==r && b%r==0)
            {
                return cn[i].getId();
            }
        }
        return 0;
    }
}
class Cinema
{
    private int id;
    private String director;
    private int rating, budget;

    public Cinema(int id, String director, int rating, int budget) {
        this.id = id;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }

    
}