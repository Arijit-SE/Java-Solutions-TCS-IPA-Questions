package IPA20;
import java.util.*;
public class IPA20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine[] eng = new Engine[4];
        for (int i = 0; i < eng.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            eng[i]=new Engine(a, b, c, d);
        }
        String t = sc.nextLine();
        String n = sc.nextLine();
        int ans1 = findAvgEnginePriceByType(eng,t);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("There are no engine with given type");
        }

        Engine[] ans2 = searchEngineByName(eng,n);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getId());
            }
        }
    }
    public static int findAvgEnginePriceByType(Engine[]e, String t)
    {
        int sum=0, count=0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getType().equalsIgnoreCase(t))
            {
                sum+=e[i].getPrice();
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

    public static Engine[] searchEngineByName(Engine[]e, String n)
    {
        Engine[] arr = new Engine[0];
        for (int i = 0; i < e.length; i++) {
            if(e[i].getName().equalsIgnoreCase(n))
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=e[i];
            }
        }
        Engine data;
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i].getId()>arr[j].getId())
                {
                    data = arr[i];
                    arr[i] = arr[j];
                    arr[j] = data;
                }
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
class Engine
{
    private int id;
    private String name;
    private String type;
    private double price;
    public Engine(int id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}