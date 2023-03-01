/* Find maximum prime from diagonals of a matrix
 * 7 8 9
 * 4 5 6
 * 1 2 3
 * Max prime of two diagonal = 7
 */

import java.util.*;
public class MaxPrimeDiaMatrix {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i =0 ; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int p = Math.max(row,col);
        int[] dia1 = new int[p];
        int[] dia2 = new int[p];
        int[] dia = new int[p+p];
        for(int i = 0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==j)
                {
                    dia1[i]=arr[i][j];
                }
            }
        }
        for(int i = row-1; i>-1; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==j)
                {
                    dia2[i]=arr[i][j];
                }
            }
        }
        int count = 0, loop, num2=0;
        int num=0;
        for(int i=0; i<p; i++)
        {
            dia[i]=dia1[i];
            count++;
        }
        for(int i=0; i<p; i++)
        {
            dia[count++]=dia2[i];
        }
        for(int k = 0; k<(p+p); k++)
        {
            loop=0;
            for(int i=2; i<dia[k]; i++)
            {
                if(dia[k]%i==0)
                {
                    loop++;
                }
            }
            if(loop==0)
            {
                num = dia[k];
            }
            if( num > num2)
            {
                num2 = num;
            }
        }
        System.out.println("Max Prime : "+num2);
    }
}
