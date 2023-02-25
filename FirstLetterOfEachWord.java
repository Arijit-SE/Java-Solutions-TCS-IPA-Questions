/* Find first letter of each word in a string 
    Input : Kalyani Govt. Eng. College
    Output : KGEC
*/ 

import java.util.*;
public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        s = s+str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ')
            {
                s = s + str.charAt(i+1);
            }
        }
        System.out.println(s);
    }
}
