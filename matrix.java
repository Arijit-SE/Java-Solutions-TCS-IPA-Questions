package Java;
import java.util.*;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[]dia1 = new int[n];
        int[] dia2 = new int[n];
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==j)
                {
                    dia1[i]=arr[i][j];
                }
            }  
        }
        for(i=n-1; i>=0; i--)
        {
            for(j=0; j<n; j++)
            {
                if(j == (n-1-i))
                {

                    dia2[j]=arr[j][i];
                }
            }
        }
        System.out.println(Arrays.toString(dia2));

        int[] result = new int[dia1.length+dia2.length];
        System.arraycopy(dia1,0,result,0,dia1.length);
        System.arraycopy(dia2, 0, result, dia1.length, dia2.length);
        System.out.println(Arrays.toString(result));
        int[] prime = new int[n];
        for(i=0; i<n; i++)
        {
            int check =0;
            for(j=2; j<result[i]; j++)
            {
                if(result[i]%j==0)
                {
                    check++;
                }
            }
            if(check==0)
            {
                prime[i]=result[i];
            }
        }
        System.out.println(Arrays.toString(prime));
        int max = 0;
        for (i=0; i<prime.length; i++)
        {
            if(prime[i]>max)
            {
                max = prime[i];
            }
        }
        System.out.println("The maximum prime : "+max);
    }
}
