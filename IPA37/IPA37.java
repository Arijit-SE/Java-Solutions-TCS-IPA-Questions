package IPA37;
import java.util.*;
public class IPA37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song[] s = new Song[5];
        for (int i = 0; i < s.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            s[i] = new Song(a,b,c,d);
        }
        String ar = sc.nextLine();
        String arr = sc.nextLine();
        double ans1 = findSongDurationForArtist(s,ar);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("There are no songs with given artist");
        }
        Song[] ans2 = getSongsInAscendingOrder(s,arr);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getId());
                System.out.println(ans2[i].getTitle());
            }
        }
        else
        {
            System.out.println("There are no songs with given artist");
        }
    }
    public static double findSongDurationForArtist(Song[]s, String a)
    {
        double sum = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].getArtist().equalsIgnoreCase(a))
            {
                sum += s[i].getDuration();
            }
        }
        return sum;
    }
    public static Song[] getSongsInAscendingOrder(Song[]s, String a)
    {
        Song[] arr = new Song[0];
        for (int i = 0; i < s.length; i++) 
        {
            if(s[i].getArtist().equalsIgnoreCase(a))
            {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = s[i];
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i].getDuration()>arr[j].getDuration())
                {
                    Song k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
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

class Song
{
    int id;
    String title;
    String artist;
    double duration;
    public Song(int id, String title, String artist, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
}