package IPA24;
import java.util.*;
public class IPA24
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Inventory[] in = new Inventory[4];
        for (int i = 0; i < in.length; i++) {
            String a = sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            in[i] = new Inventory(a, b, c, d);
        }
        int lim = sc.nextInt();
        Inventory[] ans = Replenish(in,lim);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                if(ans[i].getTh()>75)
                {
                    System.out.println(ans[i].getId()+" Critical Falling");
                }
                else if(ans[i].getTh()>=50 && ans[i].getTh()<=75)
                {
                    System.out.println(ans[i].getId()+" Moderate Filling");
                }
                else
                {
                    System.out.println(ans[i].getId()+" Non-Critical Filling");
                }
            }
        }
    }
    public static Inventory[] Replenish(Inventory[] in, int lim)
    {
        Inventory[] arr = new Inventory[0];
        for (int i = 0; i < in.length; i++) {
            if(lim>=in[i].getTh())
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = in[i];
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

class Inventory
{
    private String id;
    private int max, cur, th;
    public Inventory(String id, int max, int cur, int th) {
        this.id = id;
        this.max = max;
        this.cur = cur;
        this.th = th;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getCur() {
        return cur;
    }
    public void setCur(int cur) {
        this.cur = cur;
    }
    public int getTh() {
        return th;
    }
    public void setTh(int th) {
        this.th = th;
    }

    
}