/* Sort name by dictionary order
    Input
    -----------------
    Arijit
    Minaz
    Arnab

    Output
    -------------------
    Arijit
    Arnab
    Minaz
 */

import java.util.*;
public class SortingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        String name = "";
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].compareTo(str[j])>0)
                {
                    name = str[i];
                    str[i]=str[j];
                    str[j]=name;
                } 
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
