package macovid;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import macovid.dataMembers.Name;
import macovid.dataMembers.Population;
import macovid.dataMembers.ReportDate;
import macovid.dataMembers.TestingRate;
import macovid.dataMembers.TotalCaseCount;
import macovid.dataMembers.TotalPositiveTestCount;
import macovid.dataMembers.TotalTestCount;
import macovid.dataMembers.TwoWeekCaseCount;
import macovid.dataMembers.TwoWeekTestCount;

public class Main {
  public static String testResults_file_path;
  public static String testResults_file_name;
  public static String finalTestResults_file_path;
  public static String finalTestResults_file_name;
  public static final String CSV = ".csv";
  public static List<Settlement> testResults = new ArrayList<Settlement>();
  public static List<FinalTestResults> finalTestResults = new ArrayList<FinalTestResults>();

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.print("Enter the name of the test file: ");
    testResults_file_path = "src/macovid/";
    testResults_file_name = scanner.next();
    testResults_file_path += testResults_file_name + CSV;

    System.out.println();
    System.out.print("Enter the name of the final results file: ");
    finalTestResults_file_path = "src/macovid/";
    finalTestResults_file_name = scanner.next();
    finalTestResults_file_path += finalTestResults_file_name;

    readTestResults(testResults_file_path);
    System.out.println("=====================================================================");
    System.out.println();
    System.out.printf("Printing out the contents for the file: %s%s%n",testResults_file_name, CSV);
    for (Settlement result : testResults){
      System.out.print(result);
    }

    /**
     *  TODO:
     *  Incidence is calculated
     *
     *  Daily new cases     New Daily Cases (average of last days)
     *  100k population   = --------------------------------------
     *                      population / 100000
     */
    // printing finalTestResults
    CSVWriter writer = new CSVWriter(new FileWriter("finalResults.csv"));
    System.out.println();
    System.out.printf("%nPrinting out final results for the file: %s%s%n", finalTestResults_file_name, CSV);

    for (Settlement result : testResults){

      finalTestResults.add(new FinalTestResults( result));

//      finalTestResults.add(new FinalTestResults(
//          result.getCityTownName(),
//          result.getCityTownPopulation(),
//          result.getTotalCaseCount(),
//          result.getTwoWeekCaseCount(),
//          result.getTotalTests(),
//          result.getTwoWeekTotalTests(),
//          result.getTotalPositiveTests(),
//          result.getTestingRate(),
//          result.getTestResultsDate()
//      ));
    }

    for (FinalTestResults result : finalTestResults){
      System.out.print(result);
    }
  }

  public static void readTestResults(String filename) {
    Name name;
    Population population;
    TotalCaseCount totalCaseCount;
    TwoWeekCaseCount twoWeekCaseCount;
    TotalTestCount totalTestCount;
    TwoWeekTestCount twoWeekTestCount;
    TotalPositiveTestCount totalPositiveTestCount;
    TestingRate testingRate;
    ReportDate reportDate;
    Settlement settlement;

    try (CSVReader reader = new CSVReader(new FileReader(testResults_file_path))) {
      String[] lineInArray;

      while ((lineInArray = reader.readNext()) != null) {
        if (lineInArray[2] == "<5")
          lineInArray[2] = "0";

        name = new Name(lineInArray[0]);
        population = new Population(Integer.parseInt(lineInArray[1]));
        totalCaseCount = new TotalCaseCount(Integer.parseInt(lineInArray[2]));
        twoWeekCaseCount = new TwoWeekCaseCount(Integer.parseInt(lineInArray[3]));
        totalPositiveTestCount = new TotalPositiveTestCount(Integer.parseInt(lineInArray[4]));
        testingRate = new TestingRate(Double.parseDouble(lineInArray[5]));
        reportDate = new ReportDate(lineInArray[6]);

        settlement = new Settlement( name, population, totalCaseCount, twoWeekCaseCount,
            totalTestCount, twoWeekTestCount, totalPositiveTestCount, testingRate, reportDate);

        testResults.add(settlement);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

