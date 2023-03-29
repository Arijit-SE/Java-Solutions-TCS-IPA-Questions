/* Input: "Hello@123World456"

Process:
Array: ["Hello", "@", "123", "World", "456"]
Now you should concatenate all the strings in the array and multiply it with the sum of the position of that array where 
numbers are stored.
Sum of positions of numbers in the array = 3 + 5 = 8
Concatenated string = "Hello@123World456"
Result = 8 * "Hello@123World456" = "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456Hello@123World456Hello@123World456"

Output:
"Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456"

*/
import java.util.*;
public class RepeatString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = new String[0];
        String ch = "";
        String num = "";
        String sign = "";
        for (int i = 0; i < s.length(); i++) 
        {
            if(Character.isAlphabetic(s.charAt(i))==true)
            {
                ch = ch + s.charAt(i);
                if(num!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = num;
                    num = "";
                }
                else if(sign!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = sign;
                    sign = "";
                }
            }
            else if(Character.isDigit(s.charAt(i))==true)
            {
                num += s.charAt(i);
                if(ch!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = ch;
                    ch = "";
                }
                else if(sign!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = sign;
                    sign = "";
                }
            }
            else
            {
                sign += s.charAt(i);
                if(ch!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = ch;
                    ch = "";
                }
                else if(num!="")
                {
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = num;
                    num = "";
                }

            }
        }
        if(num!="")
        {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = num;
            num = "";
        }
        else if(ch!="")
        {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = ch;
            ch = "";
        }
        else
        {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1] = sign;
            sign = "";
        }
        String ar = Arrays.toString(arr);
        System.out.println("The array conversion: "+ar);
        int pos = 0;
        for (int j = 0; j < arr.length; j++) {
            if(Character.isDigit(arr[j].charAt(0)))
            {
                pos += j;
            }
        }
        /*
        String res = s.repeat(pos);
        System.out.println(res);
        */
        for (int j = 0; j < pos; j++) {
            System.out.print(s);
        }
    }
}
