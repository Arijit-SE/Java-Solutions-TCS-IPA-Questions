/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum+= Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),3);   
        }
        if(sum == Integer.parseInt(num))
        {
            System.out.println("Yes, the number is an Armstrong number.");
        }
        else{
            System.out.println("No, the number is not an Armstrong number.");
        }
    }
}
