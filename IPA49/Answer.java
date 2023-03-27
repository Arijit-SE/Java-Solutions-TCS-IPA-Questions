package IPA49;
import java.util.*;
public class Answer 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Bill[] bill = new Bill[n];
        for (int i = 0; i < bill.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            bill[i] = new Bill(a,b,c,d,e);
        }
        boolean s = sc.nextBoolean();sc.nextLine();
        String t = sc.nextLine();
        Bill ans1 = findBillWithMaxBillAmountBasedOnStatus(bill,s);
        if(ans1!=null)
        {
            System.out.println(ans1.getBillNo()+"#"+ans1.getName());
        }
        else
        {
            System.out.println("There are no bill with the given status");
        }
        int ans2 = getCountWithTypeOfConnection(bill,t);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("There are no bills with given type of connection");
        }
    } 
    public static Bill findBillWithMaxBillAmountBasedOnStatus(Bill[] b, boolean s)
    {
        Bill[] bill = new Bill[0];
        for (int i = 0; i < b.length; i++) {
            if(b[i].getStatus()==s)
            {
                bill = Arrays.copyOf(bill,bill.length+1);
                bill[bill.length-1] = b[i];
            }
        }
        Bill max = bill[0];
        for (int i = 0; i < bill.length; i++) {
            if(bill[i].getBillAmount()>max.getBillAmount())
            {
                max = bill[i];
            }
        }
        if(max!=null)
        {
            return max;
        }
        return null;
    }
    public static int getCountWithTypeOfConnection(Bill[] b, String t)
    {
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i].getTypeOfConnection().equalsIgnoreCase(t))
            {
                c++;
            }
        }
        return c;
    }
}
class Bill
{
    int billNo;
    String name;
    String typeOfConnection;
    double billAmount;
    boolean status;
    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
    public int getBillNo() {
        return billNo;
    }
    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeOfConnection() {
        return typeOfConnection;
    }
    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}