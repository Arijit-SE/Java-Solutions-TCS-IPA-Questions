import java.util.*;
public class SumOfEvenDigit {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        /*int num = sc.nextInt();
        while(num>0)
        {
            int rem = num%10;
            if(rem%2==0)
            {
                sum+=rem;
            }
            num = num/10;
        }*/
        // Another solution
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
            int k = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(k%2==0)
            {
                sum+=k;
            }
        }
        System.out.println("The sum of even digit : "+sum);
    }
}
