import java.util.*;
public class practice1 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of V :");
        int v = sc.nextInt();
        System.out.print("Value of W :");
        int w = sc.nextInt();
        if (w>=2 && w%2==0 && v<w)
        {
            int FW = ((w-2*v)/2);
            int TW = v-FW;
            System.out.println("FW = "+FW);
            System.out.println("TW = "+TW);
        }
        else
        {
            System.out.println("Invalid input");
        }
        
    }    
}
