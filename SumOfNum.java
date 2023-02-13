package Java;
import java.util.*;
public class SumOfNum 
{
    public static void main(String[] args) 
    {
        int sum=0,num=0;
        String str = "123Arijit1998Arijit";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
            {
                num=(num*10)+Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            else if(num!=0)
            {
                sum = sum+num;
                num=0;
            }
        }
        if(num>0)
        {
            sum = sum+num;
        }
        System.out.println(sum);
    }
}
