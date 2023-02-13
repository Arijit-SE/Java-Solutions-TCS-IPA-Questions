import java.util.*;
public class practice2
{
    public static void main(String[]args)
    {
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='*')
            {
                a++;
            }
            if(arr[i]=='#')
            {
                b++;
            }
        }
        System.out.println(a-b);
    }    
}
