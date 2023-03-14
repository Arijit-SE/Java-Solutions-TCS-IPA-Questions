/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 * 
 * Input : 123
 * Output : 321
 * 
 * Input : 234
 * Output : Can not reverse
 */

 import java.util.*;
 public class Odd_Reverse
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Can't reverse");
        }
        else
        {
            int sum=0;
            while(num>0)
            {
                int rem = num%10;
                sum = sum*10 + rem;
                num = num/10;
            }
            System.out.println("The reverse of the number : "+sum);
        }
    }
 }