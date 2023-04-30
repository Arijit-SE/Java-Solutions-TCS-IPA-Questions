/* Count the sum of prime digits in a given number
 * 
 * Input: 2345678910
 * Output: 17
 * 
 * Explaination: 2+3+5+7 = 17
 */

import java.util.*;
public class test
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int sum = SumPrime(s);
        if(sum>0)
        {
            System.out.println(sum);
        }
        else
        {
            System.out.println("No prime digits are there");
        }
    }
    public static int SumPrime(String s)
    {
        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(isPrime(s.charAt(i)))
            {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return sum;
    }
    public static boolean isPrime(char a)
    {
        int num = Integer.parseInt(String.valueOf(a));
        for (int i = 2; i < num; i++) {
            if(a%i == 0)
            {
                return false;
            }
        }
        if(num<2)
        {
            return false;
        }
        return true;
    }
}