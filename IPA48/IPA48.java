package IPA48;
import java.util.*;
public class IPA48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        String ans = findValidScores(arr);
        if(ans!=null)
        {
            System.out.println("Valid scores are = "+ans);
        }
        else
        {
            System.out.println("No valid score found.");
        }
    }
    public static boolean ValidateScore(double n)
    {
        if(n>0 && n<=100 && (int)n==n)
        {
            return true;
        }
        return false;
    }
    public static String findValidScores(double[] a)
    {
        int[] ar = new int[0];
        for (int i = 0; i < a.length; i++) {
            if(ValidateScore(a[i])==true)
            {
                ar = Arrays.copyOf(ar,ar.length+1);
                ar[ar.length-1] = (int)a[i];
            }
        }
        if(ar.length>0)
        {
            String arr = Arrays.toString(ar);
            return arr;
        }
        return null;
    }
}
