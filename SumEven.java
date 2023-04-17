/* Write a Java program to find the sum of all even numbers in an array of integers.

Here's an example of the expected input and output:

Input array: {10, 5, 20, 8, 13}
Output: 
Sum of even numbers: 38

*/
import java.util.*;
public class SumEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num = new int[5];
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(num[i]%2==0)
            {
                sum += num[i];
            }
        }
        System.out.println("Sum of even numbers: "+sum);
    }
}
