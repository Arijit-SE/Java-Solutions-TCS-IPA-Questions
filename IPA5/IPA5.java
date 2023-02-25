package IPA5;

import java.util.*;
public class IPA5 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Motel[] m = new Motel[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            m[i] = new Motel(a,b,c,d,e,f);
        }
        String cf = sc.nextLine();
        int total = totalNoOfRoomsBooked(m, cf);
        if(total!=0)
        {
            System.out.println(total);
        }
        else{
            System.out.println("No such rooms booked");
        }

    }
    public static int totalNoOfRoomsBooked(Motel[] m,String check)
    {
        int total = 0;
        for(int i = 0; i<m.length; i++)
        {
            if(m[i].getCabFacility().equalsIgnoreCase(check) && m[i].getNoOfRoomsBooked()>5)
            {
                total = total +  m[i].getNoOfRoomsBooked();
            }
        }
        if(total>0)
        {
            return total;
        }
        else{
            return 0;
        }
    }
}
class Motel
{
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill)
    {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public int getMotelId()
    {
        return motelId;
    }
    public void setMotelId(int motelId)
    {
        this.motelId = motelId;
    }
    public String getMotelName()
    {
        return motelName;
    }
    public void setMotelName(String motelName)
    {
        this.motelName = motelName;
    }
    public String getDateOfBooking()
    {
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking)
    {
        this.dateOfBooking= dateOfBooking;
    }
    public int getNoOfRoomsBooked()
    {
        return noOfRoomsBooked;
    }
    public void setNoOfRoomBooked(int noOfRoomsBooked)
    {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }
    public String getCabFacility()
    {
        return cabFacility;
    }
    public void setCabFacility(String cabFacility)
    {
        this.cabFacility = cabFacility;
    }
    public double getTotalBill()
    {
        return totalBill;
    }
    public void setTotalBill(double totalBill)
    {
        this.totalBill = totalBill;
    } 
}