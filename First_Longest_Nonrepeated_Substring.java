// Find the first non repeated character substring
//Arijit = Arij
import java.util.*;
public class First_Longest_Nonrepeated_Substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        int i,j,count=0;
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j <= i; j++)
            {
                if(i==j)
                {
                    s = s + str.charAt(i);
                }
                else
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        count++;
                        break;
                    }
                }
            }
            if(count>0)
            {
                break;
            }
        }
        System.out.println(s);
    }
}
