/* Find occurance of a character in a string
    Input
    --------------
 *  Priyanka
 *  a
 
 *  Output
    ----------------
 *  2
 */
import java.util.*;
public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==s.charAt(0))
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(count);
        }
        else{
            System.out.println("NA");
        }
    }
}
