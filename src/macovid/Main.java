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
  public static List<TestResult> testResults = new ArrayList<TestResult>();
  public static List<FinalTestResult> finalTestResults = new ArrayList<FinalTestResult>();

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
    finalTestResults_file_path += finalTestResults_file_name + CSV;

    readTestResults(testResults_file_path);
    System.out.println();
    System.out.println("=====================================================================");
    System.out.println();
    System.out.printf("Reporting data from [%s] and generating results to [%s].%n%n",
        testResults_file_path,
        finalTestResults_file_path
    );
    System.out.println("=====================================================================");
    System.out.println();
    System.out.printf("Printing out the contents for the file: %s%s%n",testResults_file_name, CSV);
    for (TestResult result : testResults){
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

    for (TestResult result : testResults){
      // build the final results list by adding a finalResult built from each testResult
      finalTestResults.add(getFinalTestResults(result));
    }

    for (FinalTestResult result : finalTestResults){
      System.out.print(result);
    }
  }

  /**
   * getFinalTestResults will be called from loop over the testResults
   *
   * @param testResult
   */
  public static FinalTestResult getFinalTestResults(TestResult testResult){
    Name name =
        new Name(testResult.getCityTownName().getValue());
    Population population =
        new Population(testResult.getCityTownPopulation().getValue());
    TotalCaseCount totalCaseCount =
        new TotalCaseCount(testResult.getTotalCaseCount().getValue());
    TwoWeekCaseCount twoWeekCaseCount =
        new TwoWeekCaseCount(testResult.getTwoWeekCaseCount().getValue());
    TotalTestCount totalTestCount =
        new TotalTestCount(testResult.getTotalTests().getValue());
    TwoWeekTestCount twoWeekTestCount =
        new TwoWeekTestCount(testResult.getTwoWeekTotalTests().getValue());
    TotalPositiveTestCount totalPositiveTestCount =
        new TotalPositiveTestCount(testResult.getTotalPositiveTests().getValue());
    TestingRate testingRate =
        new TestingRate(testResult.getTestingRate().getValue());
    ReportDate reportDate =
        new ReportDate(testResult.getTestResultsDate().getValue());
    Settlement settlement =
        new Settlement( name, population, totalCaseCount, twoWeekCaseCount,
            totalTestCount, twoWeekTestCount, totalPositiveTestCount, testingRate, reportDate);
    FinalTestResult finalTestResult =
        new FinalTestResult(settlement);
    return finalTestResult;
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
    TestResult testResult;

    try (CSVReader reader = new CSVReader(new FileReader(testResults_file_path))) {
      String[] lineInArray;

      while ((lineInArray = reader.readNext()) != null) {
        if (lineInArray[2] == "<5")
          lineInArray[2] = "0";

        name = new Name(lineInArray[0]);
        population = new Population(Integer.parseInt(lineInArray[1]));
        totalCaseCount = new TotalCaseCount(Integer.parseInt(lineInArray[2]));
        twoWeekCaseCount = new TwoWeekCaseCount(Integer.parseInt(lineInArray[3]));
        totalTestCount = new TotalTestCount(Integer.parseInt(lineInArray[4]));
        twoWeekTestCount = new TwoWeekTestCount(Integer.parseInt(lineInArray[5]));
        totalPositiveTestCount = new TotalPositiveTestCount(Integer.parseInt(lineInArray[6]));
        testingRate = new TestingRate(Double.parseDouble(lineInArray[7]));
        reportDate = new ReportDate(lineInArray[8]);

        settlement = new Settlement( name, population, totalCaseCount, twoWeekCaseCount,
            totalTestCount, twoWeekTestCount, totalPositiveTestCount, testingRate, reportDate);
        testResult = new TestResult(settlement);

        testResults.add(testResult);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

