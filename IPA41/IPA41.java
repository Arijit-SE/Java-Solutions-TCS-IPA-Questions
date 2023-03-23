package IPA41;
import java.util.*;
public class IPA41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] bnk = new BankAccount[3];
        for(int i=0; i<3; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();

            bnk[i] = new BankAccount(a,b,c);
        }
        int wa = sc.nextInt();sc.nextLine();
        double ans1 = Withdraw(bnk,wa);
        if(ans1 == -2)
        {
            System.out.println("Sorry - Account not found");
        }
        int da = sc.nextInt();sc.nextLine();
        double ans2 = Deposit(bnk,da);

        if(ans1>0)
        {
            System.out.println(ans1);
        }
        else if(ans1==-1)
        {
            System.out.println("Sorry - Insufficient balance");
        }

        if(ans2 == -1)
        {
            System.out.println("Sorry - Account not found");
        }
        else
        {
            System.out.println(ans2);
        }
        
    }
    public static double Withdraw(BankAccount[] b, int w)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<b.length; i++)
        {
            if(b[i].getAcNo() == w)
            {
                double wd = sc.nextDouble();sc.nextLine();
                if(b[i].getBalance()>=wd)
                {
                    double up = b[i].getBalance() - wd;
                    return up;
                }
                else
                {
                    return -1;
                }
            }
        }
        return -2;
    }

    public static double Deposit(BankAccount[] b, int d)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<b.length; i++)
        {
            if(b[i].getAcNo() == d)
            {
                double dp = sc.nextDouble();
                double bal = b[i].getBalance()+dp;
                return bal;
            }
        }
        return -1;
    }
}
class BankAccount
{
    private int acno;
    private String acname;
    private double balance;
    public BankAccount(int acno, String acname, double balance)
    {
        this.acno = acno;
        this.acname = acname;
        this.balance = balance;
    }
    public int getAcNo()
    {
        return acno;
    }
    public void setAcNo(int acno)
    {
        this.acno = acno;
    }
    public String getAcName()
    {
        return acname;
    }
    public void setAcName(String acname)
    {
        this.acname = acname;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}