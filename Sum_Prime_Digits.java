/* Count the sum of prime digits in a given number
 * 
 * Input: 2345678910
 * Output: 17
 * 
 * Explaination: 2+3+5+7 = 17
 */

import java.util.*;
public class Sum_Prime_Digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < k.length(); i++) {
            if(isPrime(k.charAt(i)))
            {
                sum+= Integer.parseInt(String.valueOf(k.charAt(i)));
            }
        }
        if(sum>0)
        {
            System.out.println("Sum of the prime digits: "+sum);
        }
        else
        {
            System.out.println("No prime digits found");
        }
    }
    public static boolean isPrime(char k)
    {
        int n = Integer.parseInt(String.valueOf(k));
        if(n<2)
        {
            return false;
        }
        for (int i = 2; i < n; i++) 
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}            
