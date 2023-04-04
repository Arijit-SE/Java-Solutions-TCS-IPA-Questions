/* Find the occurance of each character in a string
 * Input: Hello world
 * Output:
 *  H: 1
    e: 1
    l: 3
    o: 2
    w: 1
    r: 1
    d: 1
*/

import java.util.*;
public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replace(" ","");
        LinkedHashMap<Character,Integer> count = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if(!count.containsKey(s.charAt(i)))
            {
                count.put(s.charAt(i),1);
            }
            else
            {
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
        }
        for(HashMap.Entry<Character,Integer> data : count.entrySet())
        {
            System.out.println(data.getKey()+": "+data.getValue());
        }
    }
}
