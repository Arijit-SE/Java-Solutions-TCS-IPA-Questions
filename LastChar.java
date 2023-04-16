/* Last Character of each word of a sentence

 * Input: Kalyani Government Engineering College
 * Output: itge
 */

import java.util.*;
public class LastChar {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i)==' ')
            {
                if(Character.isAlphabetic(s.charAt(i-1)))
                {
                    ans = ans+s.charAt(i-1);
                }
            }
            else if(i==s.length()-1 && Character.isAlphabetic(s.charAt(i)))
            {
                ans = ans+s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
