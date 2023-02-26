package IPA22;
import java.util.*;
public class IPA22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] as = new Associate[5];
        for (int i = 0; i < as.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            as[i] = new Associate(a, b, c, d);
        }
        String st = sc.nextLine();
        Associate[] ans = associatesForGivenTechnology(as,st);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getId());
            }
        }
    }
    public static Associate[] associatesForGivenTechnology(Associate[] a, String s)
    {
        Associate[] arr = new Associate[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i].getTech().equalsIgnoreCase(s) && a[i].getYear()%5==0)
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=a[i];
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

class Associate
{
    private int id;
    private String name;
    private String tech;
    private int year;

    public Associate(int id, String name, String tech, int year) {
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.year = year;
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
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
}