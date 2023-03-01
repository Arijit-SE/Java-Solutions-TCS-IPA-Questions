/* Find number of even digits in a number. If it greater than 2 then print true otherwise false */

import java.util.*;
public class EvenDigit {
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
