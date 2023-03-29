package IPA50;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] ac = new BankAccount[2];
        for (int i = 0; i < ac.length; i++) {
            System.out.println("Account "+(i+1)+":");
            System.out.print("Account Number: ");
            String a = sc.nextLine();
            System.out.print("Account Holder Name: ");
            String b = sc.nextLine();
            System.out.print("Balance: ");
            double c = sc.nextDouble();sc.nextLine();
            ac[i] = new BankAccount(a,b,c);
            System.out.println();
        }
        System.out.println("Transfer Details:");
        System.out.print("Amount: ");
        double amount = sc.nextDouble();sc.nextLine();
        System.out.print("Transaction Code: ");
        String tran = sc.nextLine();
        System.out.println();
        BankUtils bu = new BankUtils(ac[0], ac[1], amount, tran);
        System.out.println("Before Transfer:");
        for (int i = 0; i < ac.length; i++) 
        {
            System.out.println("Account "+(i+1)+": "+ac[i].getAcname()+" - "+ac[i].getAcno()+" - "+ac[i].getBalance());
        }
        double[] ans = transferFunds(bu);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fTimestamp = sdf.format(timestamp);    
        Transaction t = new Transaction(tran,amount,fTimestamp);
        System.out.println();

        if(ans!=null)
        {
            System.out.println("After Transfer:");
            for (int i = 0; i < ans.length; i++) 
            {
                System.out.println("Account "+(i+1)+": "+ac[i].getAcname()+" - "+ac[i].getAcno()+" - "+ans[i]);
            }
            System.out.println();
            System.out.println("Transaction Details:");
            System.out.println("Transaction Code: "+t.getTransactionCode());
            System.out.println("Amount Transferred: "+t.getAmount());
            System.out.println("Timestamp: "+t.getTimestamp());
        }
        else
        {
            System.out.println("Insufficient Balance in Account 1");
            System.out.println("Transaction Code: "+t.getTransactionCode());
            System.out.println("Timestamp: "+t.getTimestamp());
        }

    }   
    public static double[] transferFunds(BankUtils b)
    {
        if(b.fromAccount.getBalance()>b.getAmount())
        {
            double amount1 = b.fromAccount.getBalance()-b.getAmount();
            double amount2 = b.toAccount.getBalance()+b.getAmount();
            double[] amount = {amount1,amount2};
            return amount;
        }
        return null;
    }
}
class BankAccount
{
    private String acno;
    private String acname;
    private double balance;
    public BankAccount(String acno, String acname, double balance) {
        this.acno = acno;
        this.acname = acname;
        this.balance = balance;
    }
    public String getAcno() {
        return acno;
    }
    public void setAcno(String acno) {
        this.acno = acno;
    }
    public String getAcname() {
        return acname;
    }
    public void setAcname(String acname) {
        this.acname = acname;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class BankUtils
{
    BankAccount fromAccount;
    BankAccount toAccount;
    double amount;
    String transactionCode;
    public BankUtils(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionCode = transactionCode;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getTransactionCode() {
        return transactionCode;
    }
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    } 
}
class Transaction
{
    String transactionCode;
    double amount;
    String timestamp;
    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }
    public String getTransactionCode() {
        return transactionCode;
    }
    public double getAmount() {
        return amount;
    }
    public String getTimestamp() {
        return timestamp;
    }
}