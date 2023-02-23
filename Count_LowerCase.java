import java.util.*;
public class Count_LowerCase {
    public static void main(String[]args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr;
        arr = s.toCharArray();
        for(int i=0; i<arr.length;i++)
        {
            if(Character.isLowerCase(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
