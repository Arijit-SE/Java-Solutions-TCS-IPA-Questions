package IPA31;
import java.util.*;
public class Music_IPA{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Music[] m = new Music[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            m[i] = new Music(a,b,c,d);
        }
        int num = sc.nextInt();sc.nextLine();
        double dur = sc.nextDouble(); sc.nextLine();
        int ans1 = findAvg(m,num);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("No playlist found");
        }
        String[] ans2 = SortDur(m, dur);
        if(ans2!=null)
        {
            for(int i=0; i<ans2.length; i++)
            {
                System.out.println(ans2[i]);
            }
        }
        else
        {
            System.out.println("No playlist found with mentioned attribute");
        }
     }
     public static int findAvg(Music[] m, int num)
     {
         int k =0, sum=0;
         for(int i=0; i<m.length; i++)
         {
             if(m[i].getCount()>num)
             {
                 sum = sum+m[i].getCount();
                 k++;
             }
         }
         if(k>0)
         {
             int avg = sum/k;
             return avg;
         }
         else
         {
             return 0;
         }
     }
     public static String[] SortDur(Music[] m, double d)
     {
         String[] t = new String[0];
         double[] du = new double[0]; 
         for(int i=0; i<m.length; i++)
         {
             if(m[i].getDuration()>d)
             {
                 du = Arrays.copyOf(du, du.length+1);
                 du[du.length-1] = m[i].getDuration();
                 Arrays.sort(du);
             }
         }
         for(int i=0; i<du.length; i++)
         {
            for (int j = 0; j < m.length; j++)
            {
                if(m[j].getDuration()==du[i])
                {
                    t = Arrays.copyOf(t, t.length+1);
                    t[t.length-1]=m[j].getType();
                }
            }
         }
         if(t.length>0)
         {
             return t;
         }
         else
         {
             return null;
         }
     }
}
class Music
{
    int pNo, count;
    String type;
    double duration;
    
    public Music(int pNo, String type, int count, double duration)
    {
        this.pNo = pNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    
    public int getPNo()
    {
        return pNo;
    }
    public void setPNo(int pNo)
    {
        this.pNo = pNo;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
    public double getDuration()
    {
        return duration;
    }
    public void setDuration(double duration)
    {
        this.duration = duration;
    }
}
