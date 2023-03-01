//a2b3c1 = aabbbc

import java.util.*;
public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) 
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                System.out.print(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                int x = Integer.parseInt(String.valueOf(s.charAt(i)));
                for (int j = 1; j < x; j++) {
                System.out.print(s.charAt(i-1));
                }
            }
        }
    }
}
