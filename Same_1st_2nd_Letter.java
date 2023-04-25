/*Count the number of words in a sentence that start and end with the same letter.

Input: Anna asked about the Ginseng recipe
Output: 2

Explanation: There are two words in the sentence that start and end with the same letter - "Anna" and "Ginseng". */

import java.util.*;
public class Same_1st_2nd_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] str = s.split(" ");
        int count=0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(0)==str[i].charAt(str[i].length()-1))
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("No word found");
        }
    }
}
