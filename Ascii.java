import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(ch>s.charAt(i))
            {
                ch = s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
