import java.util.*;
public class Palindrom_in_String
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] pal = findPalindrom(s);
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
    public static boolean isPalindrom(String n)
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
    public static String[] findPalindrom(String s)
    {
        String[] arr = s.split(" ");
        String[] pal = new String[0];
        for (int i = 0; i < arr.length; i++) {
            if(isPalindrom(arr[i]))
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