package Java;
import java.util.*;
public class avg 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0; i<7; i++)
        {
            arr[i] = sc.nextInt();
        }
        int low = sc.nextInt();
        int up = sc.nextInt();

        int lowerIndex = index(arr, low);
        if(lowerIndex==0)
        {
            System.out.println("Index not found");
        }
        int upperIndex = index(arr, up);
        if(upperIndex==0)
        {
            System.out.println("Index not found");
        }
        int sum=0, count=0;
        for(int i=lowerIndex+1; i<upperIndex; i++)
        {
            sum = sum+arr[i];
            count++;
        }
        System.out.println(sum/count);
    }

    public static int index(int[] arr, int num)
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return 0;
    }
}
