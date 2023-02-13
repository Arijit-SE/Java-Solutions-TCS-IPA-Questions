package Java;
import java.util.*;
public class IPA1 {
    public static void main(String[]args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0)
        {
            int rem = n%10;
            if(rem%2==0)
            {
                count++;
            }
            n = n/10;
        }
        if(count>=3)
        {
            System.out.println("True");
        }
        else
        {
            System.out.print("False");
        }
    }  
}
