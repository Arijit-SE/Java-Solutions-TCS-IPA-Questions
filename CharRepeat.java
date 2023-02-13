// aabbbcc = a2b3c1
// abbccc = a1b2c3
import java.util.*;
public class CharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=1;
        for (int i = 0; i < s.length(); i++) 
        {
           if(i!=0 && s.charAt(i-1)==s.charAt(i) && i!=(s.length()-1))
           {
                count++;
           }
           else if(i==(s.length()-1))
           {
                if(s.charAt(i-1)!=(s.charAt(i)))
                {
                    System.out.print(s.charAt(i-1)+""+count);
                    count =1;
                    System.out.print(s.charAt(i)+""+count);
                }
                else
                {
                    count++;
                    System.out.print(s.charAt(i)+""+count);
                }
           }
           else if(i!=0 && s.charAt(i-1)!=(s.charAt(i)) && i!=(s.length()-1))
           {
                System.out.print(s.charAt(i-1)+""+count);
                count = 1;
           }
        }
        System.out.println();

    }
}
