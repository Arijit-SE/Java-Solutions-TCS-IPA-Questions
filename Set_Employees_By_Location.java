/* Group the employees by city 

 * Input:
 * ----------------
 * Employee |      City
 * ---------------------
 * Arijit       Kolkata
 * Minaz        Mumbai
 * Rahul        Chennai
 * Rajesh       Kolkata
 * Sekhar       Chennai
 * Kasim        Chennai

 * Output:
 * ----------------
 * Kolkata: Arijit,Rajesh
 * Mumbai: Minaz
 * Chennai: Rahul,Sekhar,Kasim
 */

import java.util.*;
public class Set_Employees_By_Location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,String> emp = new LinkedHashMap<>();
        System.out.print("Number of Employee: ");
        int n = sc.nextInt();sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+"> Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter city: ");
            String city = sc.nextLine();
            emp.put(name,city);
        }
        System.out.println();
        // Show my data set
        for(HashMap.Entry<String,String> data : emp.entrySet())
        {
            System.out.println(data.getKey()+": "+data.getValue());
        }
        System.out.println();

        LinkedHashMap<String,String> update = new LinkedHashMap<>();
        for(HashMap.Entry<String,String> data : emp.entrySet())
        {
            if(!update.containsKey(data.getValue()))
            {
                update.put(data.getValue(),data.getKey());
            }
            else
            {
                update.put(data.getValue(),update.get(data.getValue())+","+data.getKey());
            }
        }
        // List data
        for(HashMap.Entry<String,String> ans : update.entrySet())
        {
            System.out.println(ans.getKey()+": "+ans.getValue());
        }
    }    
}
