import java.util.*;
public class practice3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of time : ");
        int n = sc.nextInt();
        int[] E = new int[n];
        int[] L = new int[n];
        if(1<=n && n<=25)
        {
            for(int i=0; i<n; i++)
            {
                System.out.print("Entry "+(i+1)+":");
                E[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++)
            {
                System.out.print("Leave "+(i+1)+":");
                L[i] = sc.nextInt();
            }
        }
        int[] rem = new int[n];
        int r = 0;
        for (int i=0; i<n; i++)
        {
             r = r+E[i]-L[i];
             rem[i] = r;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(rem[i]+" ");
        }
        System.out.print("\nMaximum number of guests on cruise at an instance : ");
        int k = Arrays.stream(rem).max().getAsInt();
        System.out.println(k);

    }
}