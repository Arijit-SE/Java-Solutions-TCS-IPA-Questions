/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */

import java.util.*;
public class Remove2ConsecutiveLetter 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = removeConsecutiveDuplicates(s);
        System.out.println(result);
    }

    private static String removeConsecutiveDuplicates(String s) {
        String str = "";
        char ch = '\0';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=ch)
            {
                ch = s.charAt(i);
                str += ch;
            }
        }
        return str;
    }
}

