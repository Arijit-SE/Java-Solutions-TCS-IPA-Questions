/* Count number of vowel, consonent and digit into a string */

import java.util.*;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v =0;
        int c=0;
        int num=0;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
                {
                    v++;
                }
                else
                {
                    c++;
                }
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                num++;
            }
        }
        System.out.println("Vowel : "+v);
        System.out.println("Consonant : "+c);
        System.out.println("Number : "+num);
    }
    
}
