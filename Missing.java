/*
 *Input : 1 2 4 8 9 11 12 14
 *Output : 3 5 6 7 10 13
*/

import java.util.*;
public class Missing {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int j;
        int[] ans = new int[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            j=i;
            int k = arr[j];
            while(k+1!=arr[i+1])
            {
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]=(k+1);
                k++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}


/*
ANOTHER PROCESS
---------------------
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
*/
