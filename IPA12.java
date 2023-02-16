import java.util.*;;
public class IPA12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] m = new Medicine[4];
        for (int i = 0; i < m.length; i++) 
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            m[i] = new Medicine(a,b,c,d);
        }
        String dis = sc.nextLine();
        int[] ans = getPriceByDisease(m,dis);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }
        else{
            System.out.println("No medicine found");
        }
    }
    public static int[] getPriceByDisease(Medicine[] m, String dis)
    {
        int[] p = new int[0];
        for (int i = 0; i < m.length; i++) {
            if(m[i].getDisease().equalsIgnoreCase(dis))
            {
                p = Arrays.copyOf(p, p.length+1);
                p[p.length-1]=m[i].getPrice();
                Arrays.sort(p);
            }
        }
        if(p.length>0)
        {
            return p;
        }
        else{
            return null;
        }
    }
}
class Medicine
{
    String name;
    String batch;
    String disease;
    int price;

    public Medicine(String name, String batch, String disease, int price)
    {
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBatch()
    {
        return batch;
    }
    public void setBatch(String batch)
    {
        this.batch = batch;
    }
    public String getDisease()
    {
        return disease;
    }
    public void setDisease(String disease)
    {
        this.disease = disease;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}