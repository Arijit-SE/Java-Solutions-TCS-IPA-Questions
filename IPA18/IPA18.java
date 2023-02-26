package IPA18;
import java.util.*;
public class IPA18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Antenna[] an = new Antenna[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();sc.nextLine();
			
			an[i]=new Antenna(a,b,c,d);
		}	
		String str = sc.nextLine();
		double num = sc.nextDouble();
		int res1 = search(an,str);
		if(res1==0)
		{
			System.out.println("There is no antenna with the given parameter");
		}
		else
		{
			System.out.println(res1);
		}
		Antenna[] res2 = sortAntenna(an, num);
		if(res2 == null)
		{
			System.out.println("No Antenna found");
		}
		else
		{
			for(int i=0; i<res2.length; i++)
			{
				System.out.println(res2[i].getLead());
			}
		}
	}
	public static int search(Antenna[]an,String s)
	{
		for(int i=0; i<an.length; i++)
		{
			if(an[i].getName().equalsIgnoreCase(s))
			{
				return an[i].getId();
			}
		}
		return 0;
	}
	public static Antenna[] sortAntenna(Antenna[]an, double num)
	{
		Antenna[] a = new Antenna[0];
		for(int i=0; i<an.length; i++)
		{
			if(an[i].getVSWR()<num)
			{
				a = Arrays.copyOf(a, a.length+1);
				a[a.length-1]=an[i];
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[i].getVSWR()>a[i+1].getVSWR())
				{
					Antenna temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}		
			}
		}
		if(a.length>0)
		{
			return a;
		}	
		else
		{
			return null;
		}
	}
}

class Antenna
{
	private int id;
	private String name,lead;
	private double VSWR;
	public Antenna(int id, String name, String lead, double VSWR)
	{
		this.id = id;
		this.name = name;
		this.lead = lead;
		this.VSWR = VSWR;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLead()
	{
		return lead;
	}
	public void setLead(String lead)
	{
		this.lead = lead;
	}
	public double getVSWR()
	{
		return VSWR;
	}
	public void setVSWR()
	{
		this.VSWR=VSWR;
	}
}
