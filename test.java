/*
 *Input : 1 2 4 8 9 11 12 14
 *Output : 3 5 6 7 10 13
 */

import java.util.*;
public class test {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int num;
        for (int i = 0; i < arr.length-1; i++) {
            num = arr[i];
            while(num+1 != arr[i+1])
            {
                System.out.print(num+1+" ");
                num++;
            }
        }
    }
}
