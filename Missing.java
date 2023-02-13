package JAVA;
import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int val = 0;
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
