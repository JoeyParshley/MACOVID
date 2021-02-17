package macovid;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteObject {

  public static void main(String[] args) throws IOException {
    // instantiate the CSVWriter class
    CSVWriter writer = new CSVWriter(new FileWriter("out.csv"));

    // writing data to file
    String line1[] = {"id", "name", "salary", "start_date", "dept"};
    String line2[] = {"1", "Dad", "2548", "2012-01-01", "IT"};
    String line3[] = {"2", "Mom", "4522", "2013-02-26", "Operations"};
    String line4[] = {"3", "joey", "3021", "2016-10-10", "HR"};
    String line5[] = {"4", "rj", "6988", "2012-01-01", "IT"};

    // writing data to the csv file
    writer.writeNext(line1);
    writer.writeNext(line2);
    writer.writeNext(line3);
    writer.writeNext(line4);

    //Flushing data from writer to file
    writer.flush();
    System.out.println("Data Entered");
  }
}