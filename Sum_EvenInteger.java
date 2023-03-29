/* Write a function that takes a list of numbers as input and returns the sum of all the even numbers in the list.

For example:

Enter size of Array: 4
Create an array:
10 15 20 25
The array is: [10, 15, 20, 25]
Sum of even numbers in the array: 30

 */
import java.util.*;
public class Sum_EvenInteger 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Create an array:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        String array = Arrays.toString(num);
        System.out.println("The array is: "+array);
        int sum = SumOfEven(num);
        System.out.println("Sum of even numbers in the array: "+sum);
    }
    public static int SumOfEven(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            {
                sum += arr[i];
            }
        }
        return sum;
    }
}