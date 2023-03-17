/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class CountPrime {
    public static void main(String[] args) 
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) 
        {
            int p = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(isPrime(p)==true)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n)
    {
        int c=0;
        for (int i = 2; i < n; i++) 
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0 && n>1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
