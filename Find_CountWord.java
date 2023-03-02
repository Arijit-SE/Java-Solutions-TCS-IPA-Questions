/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the word : 2
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
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(s))
            {
                count++;
            }
        }
        System.out.println("Number of that word present in the word : "+count);
    }
}