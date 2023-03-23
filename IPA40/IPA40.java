package IPA40;
import java.util.*;
public class IPA40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[4];
        for (int i = 0; i < car.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            car[i] = new Car(a,b,c,d);
        }
        String make = sc.nextLine();
        String model = sc.nextLine();

        Car ans1 = findMostExpensiveCar(car);
        if(ans1 != null)
        {
            System.out.println(ans1.getMake());
            System.out.println(ans1.getModel());
            System.out.println(ans1.getPrice());
            System.out.println(ans1.getYear());
        }
        else
        {
            System.out.println("Sorry - No car is available");
        }

        Car ans2 = getCarByMakeAndModel(car,make,model);
        if(ans2 != null)
        {
            System.out.println(ans2.getYear());
            System.out.println(ans2.getPrice());
        }
        else
        {
            System.out.println("Sorry - No car is available");
        }
    }
    public static Car findMostExpensiveCar(Car[] c)
    {
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if(c[i].getPrice()>c[j].getPrice())
                {
                    Car h = c[i];
                    c[i] = c[j];
                    c[j] = h;
                }
            }
        }
        if(c.length>0)
        {
            return c[c.length-1];
        }
        return null;
    }
    public static Car getCarByMakeAndModel(Car[] c,String m, String n)
    {
        for (int i = 0; i < c.length; i++) {
            if(c[i].getMake().equalsIgnoreCase(m) && c[i].getModel().equalsIgnoreCase(n))
            {
                return c[i];
            }
        }
        return null;
    }
}
class Car
{
    private String make;
    private String model;
    private int year;
    private double price;
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}