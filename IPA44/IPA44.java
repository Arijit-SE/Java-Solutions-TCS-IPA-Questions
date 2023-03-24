package IPA44;
import java.util.*;
public class IPA44 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle[] r = new Rectangle[2];
        for (int i = 0; i < r.length; i++) {
            double a = sc.nextDouble();sc.nextLine();
            double b= sc.nextDouble();sc.nextLine();

            r[i] = new Rectangle(a, b);
        }
        double[] area = calculateArea(r);
        double[] per = calculatePerimeter(r);
        if(area != null && per != null)
        {
            for (int i = 0; i < 2; i++) {
                System.out.println(area[i]);
                System.out.println(per[i]);
            }
        }
        else
        {
            System.out.println("Data not found");
        }
    }
    public static double[] calculateArea(Rectangle[]r)
    {
        double[] arr = new double[0];
        for (int i = 0; i < r.length; i++) {
            double area = r[i].getL() * r[i].getB();
            arr = Arrays.copyOf(arr, arr.length+1);
            arr[arr.length-1] = area;
        }
        if(arr.length!=0)
        {
            return arr;
        }
        return null;
    }
    public static double[] calculatePerimeter(Rectangle[]r)
    {
        double[] ar = new double[0];
        for (int i = 0; i < r.length; i++) {
            double per = 2 * (r[i].getL() + r[i].getB());
            ar = Arrays.copyOf(ar, ar.length+1);
            ar[ar.length-1] = per;
        }
        if(ar.length>0)
        {
            return ar;
        }
        return null;
    }
}
class Rectangle
{
    private double l;
    private double b;
    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    } 
}