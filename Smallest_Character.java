/* Minimum Ascii valued character in a String */

import java.util.*;
public class Smallest_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        char c=s.charAt(0);
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j <= i; j++) {
                if(Character.compare(c,s.charAt(j))>0) // arijit = a
                {
                    c = s.charAt(j);
                }
            }
        }
        System.out.println(c);
    }
}
