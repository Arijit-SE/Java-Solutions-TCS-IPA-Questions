package IPA11;
import java.util.*;

import PlayerIPA;
public class IPA11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PlayerIPA[] p = new PlayerIPA[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
		
			p[i] = new PlayerIPA(a,b,c,d);
		}
		String s = sc.nextLine();
		String l = sc.nextLine();

		int ans1 = findPointsForGivenSkill(p,s);
		if(ans1!=0)
		{
			System.out.println(ans1);
		}
		else
		{
			System.out.println("The given Skill is not available");
		}

		int ans2 = getPlayerBasedOnLevel(p,s,l);
		if(ans2!=0)
		{
			System.out.println(ans2);
		}
		else
		{
			System.out.println("No player is available with specified level, skill and eligibility points");
		}
		
	}
	public static int findPointsForGivenSkill(PlayerIPA[]p,String s)
	{
		int sum = 0;
		for(int i=0; i<p.length; i++)
		{
			if(p[i].getSkill().equalsIgnoreCase(s))
			{
				sum = sum+p[i].getPoints();
			}
		}
		if(sum>0)
		{
			return sum;
		}
		else
		{
			return 0;
		}
	}
	public static int getPlayerBasedOnLevel(PlayerIPA[]p,String s, String l)
	{
		for(int i=0; i<p.length; i++)
		{
			if(p[i].getSkill().equalsIgnoreCase(s) && p[i].getLevel().equalsIgnoreCase(l) && p[i].getPoints()>=20)
			{
				return p[i].getPlayerId();
			}
		}
		return 0;
	}

}
class PlayerIPA
{
	private int playerId;
	private String skill;
	private String level;
	private int points;

	public PlayerIPA(int playerId, String skill, String level, int points)
	{
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}	
	
	public int getPlayerId()
	{
		return playerId;
	}
	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}
	public String getSkill()
	{
		return skill;
	}
	public void setSkill(String skill)
	{
		this.skill = skill;
	}
	public String getLevel()
	{
		return level;
	}
	public void setLevel(String level)
	{
		this.level = level;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
}