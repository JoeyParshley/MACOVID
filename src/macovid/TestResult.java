package macovid;

import macovid.dataMembers.Name;
import macovid.dataMembers.Population;
import macovid.dataMembers.ReportDate;
import macovid.dataMembers.TestingRate;
import macovid.dataMembers.TotalCaseCount;
import macovid.dataMembers.TotalPositiveTestCount;
import macovid.dataMembers.TotalTestCount;
import macovid.dataMembers.TwoWeekCaseCount;
import macovid.dataMembers.TwoWeekTestCount;

/**
 * TestResult
 *  - Wrapper class for the Settlement class whish is the raw test data
 *  - This class would be used to format the test data and enhance it and will
 *    be used to build the finalTestResults
 */
public class TestResult {
  private Name cityTownName;
  private Population cityTownPopulation;
  private TotalCaseCount totalCaseCount;
  private TwoWeekCaseCount twoWeekCaseCount;
  private TotalTestCount totalTests;
  private TwoWeekTestCount twoWeekTotalTests;
  private TotalPositiveTestCount totalPositiveTests;
  private TestingRate testingRate;
  private ReportDate testResultsDate;

  private Settlement settlement;

  public TestResult(Settlement settlement) {
    this.settlement = settlement;
    cityTownName = settlement.getName();
    cityTownPopulation = settlement.getPopulation();
    totalCaseCount = settlement.getTotalCaseCount();
    twoWeekCaseCount = settlement.getTwoWeekCaseCount();
    totalTests = settlement.getTotalTestCount();
    twoWeekTotalTests = settlement.getTwoWeekTestCount();
    totalPositiveTests = settlement.getTotalPositiveTestCount();
    testingRate = settlement.getTestingRate();
    testResultsDate = settlement.getReportDate();
  }

  @Override
  public String toString() {
    return String.format(
        "%n%-20s %10d %10d %10d %10d %10d %10d %10.2f %10s",
        settlement.getName().getValue(),
        settlement.getPopulation().getValue(),
        settlement.getTotalCaseCount().getValue(),
        settlement.getTwoWeekCaseCount().getValue(),
        settlement.getTotalTestCount().getValue(),
        settlement.getTwoWeekTestCount().getValue(),
        settlement.getTotalPositiveTestCount().getValue(),
        settlement.getTestingRate().getValue(),
        settlement.getReportDate().getValue()
    );
  }

  public Name getCityTownName() {
    return cityTownName;
  }

  public Population getCityTownPopulation() {
    return cityTownPopulation;
  }

  public TotalCaseCount getTotalCaseCount() {
    return totalCaseCount;
  }

  public TwoWeekCaseCount getTwoWeekCaseCount() {
    return twoWeekCaseCount;
  }

  public TotalTestCount getTotalTests() {
    return totalTests;
  }

  public TwoWeekTestCount getTwoWeekTotalTests() {
    return twoWeekTotalTests;
  }

  public TotalPositiveTestCount getTotalPositiveTests() {
    return totalPositiveTests;
  }

  public TestingRate getTestingRate() {
    return testingRate;
  }

  public ReportDate getTestResultsDate() {
    return testResultsDate;
  }

  public Settlement getSettlement() {
    return settlement;
  }
}
