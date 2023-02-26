import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortBookByPrice {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        Book[] bk = new Book[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            
            bk[i]=new Book(a,b,c,d);
        }
        Book[] k = sortBookByPrice(bk);
        if(k!=null)
        {
            for(int i =0; i<k.length; i++)
            {
                System.out.println(k[i].getId()+" "+k[i].getTitle()+" "+k[i].getAuthor()+" "+k[i].getPrice());
            }
        }
    }
    public static Book[] sortBookByPrice(Book[] b)
    {
        Book[] arr = new Book[0];
        Book k=null;
        for(int i=0; i<b.length; i++)
        {
            for(int j=i+1; j<b.length; j++)
            {
                if(b[i].getPrice()>b[j].getPrice())
                {
                    k = b[i];
                    b[i]=b[j];
                    b[j]=k;
                }
            }
        }
        return b;
    }
}
class Book
{
    int id;
    String title, author;
    double price;
    
    public Book(int id, String title, String author, double price)
    {
        this.id = id;
        this.title= title;
        this.author = author;
        this.price = price;
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}