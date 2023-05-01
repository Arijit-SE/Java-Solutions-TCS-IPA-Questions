/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a 
capital letter: "The", "Brown", and "Fox". */

import java.util.*;
public class Find_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println("The words starts with capital letter: ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].charAt(0)>='A' && s[i].charAt(0)<='Z')
            {
                System.out.println(s[i]);
            }
        }
    }
}
