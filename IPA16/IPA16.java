package IPA16;
import java.util.*;
public class IPA16
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] n = new NavalVessel[4];
        for (int i = 0; i < n.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            n[i] = new NavalVessel(a,b,c,d,e);
        }
        int perc = sc.nextInt();sc.nextLine();
        String pur = sc.nextLine();
        int ans1 = findAvgVoyagesByPct(n,perc);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        NavalVessel[] ans2 = findVesselByGrade(n,pur);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) 
            {
                int per = ans2[i].getComp()*100/ans2[i].getPlan();
                if(per == 100)
                {
                    System.out.println(ans2[i].getName()+"%Star");
                }
                else if(per>=80 && per<=99)
                {
                    System.out.println(ans2[i].getName()+"%Leader");
                }
                else if(per<=79 && per>=55)
                {
                    System.out.println(ans2[i].getName()+"%Inspirer");
                }
                else
                {
                    System.out.println(ans2[i].getName()+"%Striver");
                }
            }
        }
        else
        {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }
    public static int findAvgVoyagesByPct(NavalVessel[]n, int p)
    {
        int count=0, sum=0;
        for (int i = 0; i < n.length; i++) {
            if(n[i].getComp()*100/n[i].getPlan()>=p)
            {
                sum+=n[i].getComp();
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
    public static NavalVessel[] findVesselByGrade(NavalVessel[]n, String p)
    {
        NavalVessel[] arr = new NavalVessel[0];
        for (int i = 0; i < n.length; i++) 
        {
            if(n[i].getPurpose().equalsIgnoreCase(p))
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1]=n[i];
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
class NavalVessel
{
    int id, plan, comp;
    String name, purpose;

    public NavalVessel(int id, String name, int plan, int comp, String purpose)
    {
      this.name=name;
        this.plan = plan;
        this.comp = comp;
        this.purpose = purpose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    
    }
    
}