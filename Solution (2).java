import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Point[] pt = new Point[3];
        for(int i=0; i<3; i++)
        {
            double x = sc.nextDouble(); sc.nextLine();
            double y = sc.nextDouble();
            
            pt[i] = new Point(x, y);
        }
        Point d = ptdis(pt);
        if(d!=null)
        {
            System.out.println(d.x);
            System.out.println(d.y);
        }
        
    }
    public static Point ptdis(Point[] p)
    {
        double max = 0;
        for(int i =0; i<p.length; i++)
        {
            double dis = Math.sqrt((p[i].x)*(p[i].x)+(p[i].y)*(p[i].y));
            if(dis>max)
            {
                max = dis;
            }
        }
        for(int i =0; i<p.length; i++)
        {
            if(Math.sqrt((p[i].x)*(p[i].x)+(p[i].y)*(p[i].y))==max)
            {
                return p[i];
            }
        }
        return null;
    }
}

class Point
{
    double x;
    double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}