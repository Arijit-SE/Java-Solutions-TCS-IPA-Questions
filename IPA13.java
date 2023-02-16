import java.util.*;
public class IPA13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] au = new AutonomousCar[4];
        for (int i = 0; i < au.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            au[i] = new AutonomousCar(a,b,c,d,e);
        }
        String en = sc.nextLine();
        String br = sc.nextLine();
        int ans1 = findTestPassedByEnv(au,en);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("There are no tests passed in this particular environment");
        }
        AutonomousCar[] ans2 = updateCarGrade(au,br);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                int grade = ans2[i].getPass()*100/ans2[i].getCon();
                if(grade>=80)
                {
                    System.out.println(ans2[i].getBrand()+"::A1");
                }
                else
                {
                    System.out.println(ans2[i].getBrand()+"::B2");
                }
            }
        }
        else
        {
            System.out.println("No Car is available with the specified brand");
        }
    }
    public static int findTestPassedByEnv(AutonomousCar[] au, String en)
    {
        int sum = 0;
        for (int i = 0; i < au.length; i++) {
            if(au[i].getEnv().equalsIgnoreCase(en))
            {
                sum = sum+au[i].getPass();
            }
        }
        if(sum>0)
        {
            return sum;
        }
        else
        {
            return 0;
        }
    }
    public static AutonomousCar[] updateCarGrade(AutonomousCar[] au, String br)
    {
        AutonomousCar[] arr = new AutonomousCar[0];
        for (int i = 0; i < au.length; i++) {
            if(au[i].getBrand().equalsIgnoreCase(br))
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1]=au[i];
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        else
        {
            return null;
        }
    }
}
class AutonomousCar
{
    private int id;
    private String brand;
    private int con;
    private int pass;
    private String env;

    public AutonomousCar(int id, String brand, int con, int pass, String env)
    {
        this.id = id;
        this.brand = brand;
        this.con = con;
        this.pass = pass;
        this.env = env;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
    
}
