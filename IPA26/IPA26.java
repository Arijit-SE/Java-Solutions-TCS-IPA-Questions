package IPA26;
import java.util.*;
public class IPA26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player2[] pl = new Player2[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            pl[i] = new Player2(a,b,c,d,e);
        }
        int target = sc.nextInt();sc.nextLine();
        double[] ans = findAverageOfRuns(pl,target);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                if(ans[i]>=80 && ans[i]<=100)
                {
                    System.out.println("Grade A");
                }
                else if(ans[i]>=50 && ans[i]<=79)
                {
                    System.out.println("Grade B");
                }
                else
                {
                    System.out.println("Grade C");
                }
            }
        }
    }
    public static double[] findAverageOfRuns(Player2[]p, int t)
    {
        double[] arr = new double[0];
        for(int i=0; i<p.length; i++)
        {
            if(t<=p[i].getMatch())
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = (p[i].getRun()/p[i].getMatch());
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
class Player2
{
    private int id;
    private String name;
    private int rank, match, run;

    public Player2(int id, String name, int rank, int match, int run)
    {
        this.id = id;
        this.name = name;
        this.rank = rank;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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