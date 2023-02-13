package Java;
import java.util.*;
public class CountRepeatedLetter 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine();
        String s = str.replace(ch,"");
        System.out.println(s);
    }
}
