/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/

import java.util.*;
public class Character_odd_place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(i%2!=0)
            {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}
