import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Footwear[] ff= new Footwear[5];
        for(int i=0;i<5;i++)
        {
            int id= sc.nextInt();
            sc.nextLine();
            String name= sc.nextLine();
            String type= sc.nextLine();
            int price= sc.nextInt();
            sc.nextLine();
            ff[i]=new Footwear(id,name,type,price);
        }
        String gg= sc.nextLine();
        String hh =sc.nextLine();
        int count =getcount( ff, gg);
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("Footwear not available");
        }
        
        Footwear temp= getSecondHighestPriceByBrand( ff, hh);
        if(temp==null)
        {
            System.out.println("Brand not available");
        }
        else
        {
            System.out.println(temp.price);
        }
    }
    public static int getcount(Footwear[] ff,String gg)
    {
        int count=0;
        for(Footwear data:ff)
        {
            if(data.type.equalsIgnoreCase(gg))
            {
                count++;
            }
        }
        return count;
    }
    
    public static   Footwear getSecondHighestPriceByBrand(Footwear[] ff,String hh)
    {
         int count1=0;
        for(int i=0;i<ff.length;i++)
        {
            if(ff[i].name.equalsIgnoreCase(hh))
            {
                count1++;
            }
        }
        int[] vv= new int[count1];
        int count2=0;
        for(int i=0;i<ff.length;i++)
        {
            if(ff[i].name.equalsIgnoreCase(hh))
            {
                vv[count2]=ff[i].price;
                count2++;
            }
        }
        Arrays.sort(vv);
        int hhh = vv[vv.length-2];
        for(int i=0;i<ff.length;i++)
        {
            if(ff[i].price==hhh)
            {
                return ff[i];
            }
        }
        return null;
    }
}
class Footwear
{
    int id;
    String name;
    String type;
    int price;
    Footwear(int id,String name,String type,int price)
    {
        this.id=id;
        this.name=name;
        this.type=type;
        this.price=price;
    }
}