/*
 *Input : 1 2 4 8 9 11 12 14
 *Output : 3 5 6 7 10 13
 */

import java.util.*;
public class test {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String[] num = new String[5];
        for(int i=0;i<5;i++)
        {
            num[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(num));
        System.out.println(String.join(",",num));
        System.out.println();
    }
}
