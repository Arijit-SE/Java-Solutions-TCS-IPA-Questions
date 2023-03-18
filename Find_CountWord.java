/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */

import java.util.*;
public class Find_CountWord
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String s = sc.nextLine();
        String ch = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length(); j++) 
            {
                if(Character.isLetter(arr[i].charAt(j)))
                {
                    ch = ch + arr[i].charAt(j);
                }
            }

            if(ch.equals(s))
            {
                count++;
            }
            ch = "";
        }
        System.out.println("Number of that word present in the Sentence : "+count);
    }
}