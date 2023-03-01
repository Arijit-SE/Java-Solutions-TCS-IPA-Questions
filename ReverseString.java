/* Reverse of a string
 * Arijit = tijirA
 */
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        /* One method
        --------------------------------------
        for (int i = s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i)+"");
        }
        */
        // Another method
        //-----------------------------------
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            n = s.charAt(i)+n;
        }
        System.out.println(n);
    }
}