/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 
 * Output:
 ---------------
   1

 * Input2:
 ----------------
   Carrot
   z

 * Output:
  --------------
   NA
 */

import java.util.*;
public class IndexNumber_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==ch)
            {
                System.out.println(i);
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("NA");
        }
    }
}
