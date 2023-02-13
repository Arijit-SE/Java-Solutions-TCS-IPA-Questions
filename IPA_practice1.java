import java.util.*;
public class IPA_practice1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = null;
        word = s.split(" ");
        for(int i=0; i<word.length; i++)
        {
            System.out.println(word[i]);
        }
    }
}
