/* Count number of spaces and characters in a string 
 * Input
 * ---------
 * Arijit is bad boy
 * 
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/

import java.util.*;
public class Space_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("Number of space : "+count);
        System.out.println("Number of character : "+(s.length()-count));
    }
}
