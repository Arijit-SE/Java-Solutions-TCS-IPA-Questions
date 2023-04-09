/* Find number of upper case in a string
 * AriJIt = 3
 */

import java.util.*;
public class Count_UpperCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<92)
            //if(Character.isUpperCase(s.charAt(i)))
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No upper case available in string");
        }
        else
        {
            System.out.println(count);
        }
    }
}