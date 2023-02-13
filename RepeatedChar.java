//aabbbcc = a2b3c2
//abbc = a1b2c1
package Java;
import java.util.*;
public class RepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=1;
        for (int i = 0; i < s.length(); i++) 
        {
            if(i!=0 && i!=s.length()-1)
            {
                if(s.charAt(i-1)==s.charAt(i))
                {
                    count++;
                }
                else
                {
                    System.out.print(s.charAt(i-1)+""+count);
                    count=1;
                }
            }
            else if(i==s.length()-1)
            {
                if(s.charAt(i)==s.charAt(i-1))
                {
                    count++;
                    System.out.print(s.charAt(i)+""+count);
                }
                else
                {
                    System.out.print(s.charAt(i-1)+""+count);
                    count = 1;
                    System.out.println(s.charAt(i)+""+count);
                }
            }
        }
    }
}
