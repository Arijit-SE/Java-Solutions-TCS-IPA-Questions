/*
 * Write a Java program that takes two user input integers m and n and prints the multiplication table from 1 to n for the 
 * number m. The program should use nested for loops to generate the table.
 * 
 * Sample Input:
 * --------------------
 * 3 5
 * 
 * Sample Output:
 * --------------------
 *  3 x 1 = 3
    3 x 2 = 6
    3 x 3 = 9
    3 x 4 = 12
    3 x 5 = 15

 * Explanation:
   --------------------
   The input integers are m=3 and n=5. The program generates the multiplication table for 3 from 1 to 5. 

 */

import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(k+" x "+i+" = "+k*i);
        }
    }
}
