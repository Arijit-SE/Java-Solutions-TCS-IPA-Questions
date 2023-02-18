import java.util.*;
public class test {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String a = "";
        int i, j;
        for (i = 0; i < str.length(); i++) 
        {
            for (j = 0; j < i; j++) 
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    break;
                }    
            }
            if(i==j)
            {
                a = a + str.charAt(i);
            }
        }
        System.out.println(a);
    }
}
