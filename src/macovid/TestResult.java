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
}
