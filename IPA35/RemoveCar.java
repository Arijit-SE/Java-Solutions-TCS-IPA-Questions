package IPA35;
import java.util.*;
public class RemoveCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[5];
        for (int i = 0; i < car.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            car[i] = new Car(a,b,c);
        }
        int id = sc.nextInt();
        Car[] ans = RemoveAndRearrange(car,id);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println(car[i].getId()+":"+ans[i].getName());
            }
        }
        else
        {
            System.out.println("There are no car with given id");
        }
    }
    public static Car[] RemoveAndRearrange(Car[] c, int id)
    {
        Car[] arr = new Car[0];
        for (int i = 0; i < c.length; i++) {
            if(c[i].getId()!=id)
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = c[i];
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
class Car
{
    private int id;
    private String name;
    private String type;
    public Car(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
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
    
}