package IPA9;
import java.util.*;

public class IPA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] bk = new Book[4];
        for (int i = 0; i < bk.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();sc.nextLine();

            bk[i] = new Book(a,b,c,d,e);
        }
        String name = sc.nextLine();

        Book[] ans1 = findBookWithMaximumPrice(bk);
        if(ans1!=null)
        {
            for (int i = 0; i < ans1.length; i++) {
                System.out.println(ans1[i].getId()+" "+ans1[i].getTitle());
            }
        }
        else
        {
            System.out.println("No Book found with mentioned attribute.");
        }
        Book ans2 = searchBookByTitle(bk, name);
        if(ans2!=null)
        {
            System.out.println(ans2.getId());
            System.out.println(ans2.getPages());
        }
    }
    public static Book[] findBookWithMaximumPrice(Book[] b)
    {
        Book[] details = new Book[0];
        double max = 0;
        for (int i = 0; i < b.length; i++)
        {
            if(b[i].getPrice()>=max)
            {
                max = b[i].getPrice();
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i].getPrice()==max)
            {
                details = Arrays.copyOf(details, details.length+1);
                details[details.length-1]=b[i];
            }
        }
        if(details.length>0)
        {
            return details;
        }
        else{
            return null;
        }
    }
    public static Book searchBookByTitle(Book[] b, String n)
    {
        for (int i = 0; i < b.length; i++) {
            if(b[i].getTitle().equalsIgnoreCase(n))
            {
                return b[i];
            }
        }
        return null;
    }
}
class Book
{
    private int id, pages;
    private String title, author;
    private double price;

    public Book(int id, int pages, String title, String author, double price)
    {
        this.id = id;
        this.pages = pages;
        this.title = title;
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
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
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