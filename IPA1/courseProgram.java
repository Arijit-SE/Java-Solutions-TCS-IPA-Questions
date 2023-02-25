import java.util.*;
public class courseProgram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Course[] course = new Course[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
			int e = sc.nextInt();sc.nextLine();

			course[i] = new Course(a,b,c,d,e);	
		}
		String admin = sc.nextLine();
		int hand = sc.nextInt();
		
		int ans1 = findAvgOfQuizByAdmin(course, admin);
		if(ans1!=0)
		{
			System.out.println(ans1);
		}
		else
		{
			System.out.println("No Course found");
		}
		
		Course[] ans2 = sortCourseByHandsOn(course, hand);
		if(ans2!=null)
		{
			for(int i=0; i<ans2.length; i++)
			{
				System.out.println(ans2[i].getCname());
			}
		}
		else
		{
			System.out.println("No Course found with mentioned attribute.");
		}
	}
	public static int findAvgOfQuizByAdmin(Course[]course, String ad)
	{
		int sum=0, count=0;
		for(int i=0; i<course.length; i++)
		{
			if(course[i].getCadmin().equalsIgnoreCase(ad))
			{
				sum = sum+course[i].getQuiz();
				count++;
			}
		}
		if(count>0)
		{
			int avg = sum/count;
			return avg;
		}
		else
		{
			return 0;
		}
	}
	
	public static Course[] sortCourseByHandsOn(Course[] course, int h)
	{
		Course[] obj = new Course[0];
		for(int i=0; i<course.length; i++)
		{
			if(course[i].getHandson()<h)
			{
				obj = Arrays.copyOf(obj, obj.length+1);
				obj[obj.length-1] = course[i];
			}		
		}
		Course val;
		for(int i=0;i<obj.length;i++)
		{
			for(int j=i+1; j<obj.length; j++)
			{
				if(obj[i].getHandson()>obj[j].getHandson())
				{
					val = obj[i];
					obj[i] = obj[j];
					obj[j] = val;
				}
			}	
		}
		if(obj.length>0)
		{
			return obj;
		}
		else
		{
			return null;
		}
	}
}
class Course
{
	private int cid, quiz, handson;
	private String cname, cadmin;
	
	public Course(int cid, String cname, String cadmin, int quiz, int handson)
	{
		this.cid = cid;
		this.cname = cname;
		this.cadmin = cadmin;
		this.quiz = quiz;
		this.handson = handson;
	}
	
	public int getCid()
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public String getCadmin()
	{
		return cadmin;
	}
	public void setCadmin(String cadmin)
	{
		this.cadmin = cadmin;
	}
	public int getQuiz()
	{
		return quiz;
	}
	public void setQuiz(int quiz)
	{
		this.quiz = quiz;
	}
	public int getHandson()
	{
		return handson;
	}
	public void setHandson(int handson)
	{
		this.handson = handson;
	}
}