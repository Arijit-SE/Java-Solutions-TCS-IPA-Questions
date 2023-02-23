import java.util.*;
public class PerfectSquareOrNot {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double res = Math.sqrt(num);
        if((int)res == res)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not a perfect square");
        }
    }
}
