package IPA23;
import java.util.*;
public class IPA23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institute[] in = new Institute[4];
        for (int j = 0; j < in.length; j++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            in[j] = new Institute(a, b, c, d, e);
        }
        String loc = sc.nextLine();
        String n = sc.nextLine();
        int ans1 = FindNumClearancedByLoc(in,loc);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("There are no cleared students in this particular location");
        }
        Institute[] ans2 = UpdateInstitutionGrade(in,n);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) 
            {
                double rating = ans2[i].getPlaced()*100/ans2[i].getClear();
                if(rating>=80)
                {
                    System.out.println(ans2[i].getName()+"::A");
                }
                else
                {
                    System.out.println(ans2[i].getName()+"::B");
                }
            }
        }
        else
        {
            System.out.println("No Institute is available with the specified name");
        }
    }
    public static int FindNumClearancedByLoc(Institute[] in, String l)
    {
        int sum = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i].getLocation().equalsIgnoreCase(l))
            {
                sum += in[i].getClear();
            }
        }
        return sum;
    }
    public static Institute[] UpdateInstitutionGrade(Institute[] in, String n)
    {
        Institute[] arr = new Institute[0];
        for (int i = 0; i < in.length; i++) {
            if(in[i].getName().equalsIgnoreCase(n))
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = in[i];
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        else{
            return null;
        }
    }
}
class Institute
{
    private int id,placed,clear;
    private String name, location, grade;
    public Institute(int id, String name, int placed, int clear, String location) {
        this.id = id;
        this.clear = clear;
        this.name = name;
        this.placed = placed;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getClear() {
        return clear;
    }
    public void setClear(int clear) {
        this.clear = clear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPlaced() {
        return placed;
    }
    public void setPlaced(int placed) {
        this.placed = placed;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}