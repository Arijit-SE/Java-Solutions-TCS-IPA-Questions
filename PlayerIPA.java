import java.util.*;
public class PlayerIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] pl = new Player[4];
        for(int i =0; i<4; i++)
        {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            pl[i] = new Player(a,b,c,d,e);
        }
        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int run = LowestRuns(pl,playerType);
        if(run!=0)
        {
            System.out.println(run);
        }
        else
        {
            System.out.println("No such player");
        }

        int[] ids = AssId(pl, matchType);
        if(ids==null)
        {
            System.out.println("No Player with given match Type");
        }
        else{
            for (int i = ids.length-1; i >=0; i--) {
                System.out.println(ids[i]);
            }
        }
    }
    public static int LowestRuns(Player[] pl, String t)
    {
        int[] runs = new int[0];
        for(int i =0; i<pl.length; i++)
        {
            if(pl[i].getPType().equalsIgnoreCase(t))
            {
                runs = Arrays.copyOf(runs, runs.length+1);
                runs[runs.length-1]=pl[i].getRuns();
            }
        }
        if(runs.length>0)
        {
            Arrays.sort(runs);
            return runs[0];
        }
        else{
            return 0;
        }
    }
    public static int[] AssId(Player[] pl, String m)
    {
        int[] id = new int[0];
        for (int i = 0; i < pl.length; i++) {
            if(pl[i].getMType().equalsIgnoreCase(m))
            {
                id = Arrays.copyOf(id,id.length+1);
                id[id.length-1]=pl[i].getId();
                Arrays.sort(id);
            }
        }
        if(id.length>0)
        {
            return id;
        }
        else{
            return null;
        }
    }
}
class Player
{
    private int id, runs;
    private String name, pType, mType;

    public Player(int id, String name, int runs, String pType, String mType)
    {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.pType = pType;
        this.mType = mType;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getRuns()
    {
        return runs;
    }
    public  void setRuns(int runs)
    {
        this.runs = runs;
    }
    public String getPType()
    {
        return pType;
    }
    public void setPType(String pType)
    {
        this.pType = pType;
    }
    public String getMType()
    {
        return mType;
    }
    public void setMType(String mType)
    {
        this.mType = mType;
    }
}