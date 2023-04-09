/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/

import java.util.*;
public class First_NonRepeated_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for (int i = 0; i < s.length(); i++) 
        {
            int count=0;
            for (int j = 0; j < s.length(); j++) 
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
