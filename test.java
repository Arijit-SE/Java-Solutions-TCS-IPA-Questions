import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class test {
  public static void main(String[] args) {
    // Create a new Timestamp object with fractional seconds
    Timestamp timestamp = Timestamp.valueOf("2023-03-29 13:01:42.0");

    // Format the Timestamp to display only the date and time components without the fractional seconds
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedTimestamp = sdf.format(timestamp);

    System.out.println("Original Timestamp: " + timestamp);
    System.out.println("Formatted Timestamp without fractional seconds: " + formattedTimestamp);
  }
}
