/* Find the palindrome words from the sentence and print them and also count
 * 
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 * 
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */

import java.util.*;
public class Palindrome_in_String
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] pal = findPalindrome(s);
        if(pal!=null)
        {
            System.out.println("The palindroms are :");
            for (int i = 0; i < pal.length; i++) {
                System.out.println(pal[i]);
            }
            System.out.println("The number of palindrom words: "+pal.length);
        }
        else
        {
            System.out.println("No such palindrom words");
        }

    }
    public static boolean isPalindrome(String n)
    {
        for (int i = 0; i < n.length(); i++) 
        {
            if(n.charAt(i) != n.charAt(n.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static String[] findPalindrome(String s)
    {
        String[] arr = s.split(" ");
        String[] pal = new String[0];
        for (int i = 0; i < arr.length; i++) {
            if(isPalindrome(arr[i]))
            {
                pal = Arrays.copyOf(pal, pal.length+1);
                pal[pal.length-1] = arr[i];
            }
        }
        if(pal.length>0)
        {
            return pal;
        }
        return null;
    }
}