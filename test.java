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
