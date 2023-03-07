package IPA19;
import java.util.*;
public class IPA19
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Flower[] fl = new Flower[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
			String e = sc.nextLine();
			
			fl[i] = new Flower(a,b,c,d,e);
		}
		String f = sc.nextLine();
		int id = findMinPriceByType(fl,f);
		if(id!=0)
		{
			System.out.println(id);
		}
		else
		{
			System.out.println("There is no flower with given type");
		}
	}
	public static int findMinPriceByType(Flower[] fl, String s)
	{
		Flower[] arr = new Flower[0];
		for(int i =0; i<fl.length; i++)
		{
			if(fl[i].getType().equalsIgnoreCase(s) && fl[i].getRating()>3)
			{
				arr = Arrays.copyOf(arr,arr.length+1);
				arr[arr.length-1] = fl[i];
			}
		}
		if(arr.length>0)
		{
			Flower mini = arr[0];
			for (int j = 1; j < arr.length; j++) 
			{
				if(mini.getPrice()>arr[j].getPrice())
				{
					mini = arr[j];
				}
			}
			return mini.getFlowerId();
		} 
		return 0;
	}
}
class Flower
{
	private int flowerId;
	private String flowerName;
	private int price;
	private int rating;
	private String type;
	
	public Flower(int flowerId, String flowerName, int price, int rating, String type)
	{
		this.flowerId = flowerId;
		this.flowerName= flowerName;
		this.price = price;
		this.rating = rating;
		this.type = type;
	}
	
	public int getFlowerId()
	{
		return flowerId;
	}
	public void setFlowerId(int flowerId)
	{
		this.flowerId = flowerId;
	}
	public String getFlowerName()
	{
		return flowerName;
	}
	public void setFlowerName(String flowerName)
	{
		this.flowerName = flowerName;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
}
