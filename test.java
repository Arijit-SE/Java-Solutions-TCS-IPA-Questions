import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=Integer.parseInt(sc.nextLine());
        int n=Integer.parseInt(sc.nextLine());
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        ArrayList<Integer> ar=new ArrayList();
        for(int j=0;j<m;j++){
            arr1[j]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        
        for(int j=0;j<m;j++){
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(arr1[j]==arr2[i])
                {
                    flag=false;
                    break;
                }
            }
            if(flag){
                ar.add(arr1[j]);        
            }
        }
        for(int j: ar){
        System.out.print(j+"");
    }
} 
}