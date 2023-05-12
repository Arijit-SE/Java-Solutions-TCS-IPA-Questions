/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */

import java.util.Scanner;

public class Consonent_OddPosition {
    /*
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if((i+1)%2!=0 && !v.contains(Character.toString(s.charAt(i))) && s.charAt(i)!=' ')
            {
                System.out.print(s.charAt(i));
            }
        }    
    }
     */

    // Another Solution

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = {'a', 'e', 'i', 'o', 'u', 'A','E', 'I', 'O', 'U'};
        for (int i = 0; i < s.length(); i++) {
            boolean test = true;
            for (int j = 0; j < ch.length; j++) {
                if((i+1)%2==0 || s.charAt(i)==ch[j] || s.charAt(i)==' ')
                {
                    test = false;
                }
            }
            if(test == true)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}


