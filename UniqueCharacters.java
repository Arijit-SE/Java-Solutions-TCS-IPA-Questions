import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         input = input.toLowerCase();
         String temp = "";
         for(int i =0;i<input.length();i++){
             if(!temp.contains(Character.toString(input.charAt(i)))){
                 temp = temp+input.charAt(i);
             }
         }
         System.out.println(temp);
         sc.close();
    }
}

/*
Problem Statement
Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.

Note:
All the characters should be in lowercase only.

i/p -> 
xperience

o/p -> 
xperinc
*/