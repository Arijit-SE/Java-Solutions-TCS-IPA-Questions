/* Find number of lower case
 * AriJIt = 3
 */

import java.util.*;
public class Count_LowerCase {
    public static void main(String[]args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr;
        arr = s.toCharArray();
        /* Other process to create character array
          ******************************************
          for(int i=0; i<s.length(); i++)
          {
               arr[i] = s.charAt(i);
          }
         */
        for(int i=0; i<arr.length;i++)
        {
            if(Character.isLowerCase(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
