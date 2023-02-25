
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DocsWithOddPagesByAssId {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Document[] doc = new Document[4];
        for(int i =0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            
            doc[i] = new Document(a,b,c,d);
        }
        Document[] d = docWithOddPages(doc);
        if(d==null)
        {
            System.out.println("All pages are even");
        }
        else
        {
            for(int  i =0; i<d.length; i++)
            {
                System.out.println(d[i].getId()+" "+d[i].getTitle()+" "+d[i].getFolderName()+" "+d[i].getPages());
            }
        }
        
    }
    public static Document[] docWithOddPages(Document[] d)
    {
        Document[] st = new Document[0];
        for(int i=0; i<d.length; i++)
        {
            if(d[i].pages%2!=0)
            {
                st = Arrays.copyOf(st,st.length+1);
                st[st.length-1]=d[i];
            }
        }
        for(int i =0; i<st.length; i++)
        {
            for(int j=i+1; j<st.length; j++)
            {
                if(st[i].getId()>st[j].getId())
                {
                    Document k=st[i];
                    st[i]=st[j];
                    st[j]=k;
                }
            }
        }
        if(st.length>0)
        {
            return st;
        }
        else
        {
            return null;
        }
    }
}
class Document
{
    int id; 
    String title; 
    String folderName; 
    int pages;
    
    public Document(int id, String title, String folderName, int pages)
    {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
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
    public String getFolderName()
    {
        return folderName;
    }
    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
}
