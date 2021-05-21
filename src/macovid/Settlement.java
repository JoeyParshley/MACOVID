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
 * Settlement
 *  -   Represents a settlement of the state could be a village/town/city etc.
 *  -   Contains the raw data of the test results
 */
public class Settlement {
  private Name name;
  private Population population;
  private TotalCaseCount totalCaseCount;
  private TwoWeekCaseCount twoWeekCaseCount;
  private TotalTestCount totalTestCount;
  private TwoWeekTestCount twoWeekTestCount;
  private TotalPositiveTestCount totalPositiveTestCount;
  private TestingRate testingRate;
  private ReportDate reportDate;

  public Settlement(Name name, Population population,
      TotalCaseCount totalCaseCount, TwoWeekCaseCount twoWeekCaseCount,
      TotalTestCount totalTestCount, TwoWeekTestCount twoWeekTestCount,
      TotalPositiveTestCount totalPositiveTestCount, TestingRate testingRate,
      ReportDate reportDate) {
    this.name = name;
    this.population = population;
    this.totalCaseCount = totalCaseCount;
    this.twoWeekCaseCount = twoWeekCaseCount;
    this.totalTestCount = totalTestCount;
    this.twoWeekTestCount = twoWeekTestCount;
    this.totalPositiveTestCount = totalPositiveTestCount;
    this.testingRate = testingRate;
    this.reportDate = reportDate;
  }

  public Name getName() {
    return name;
  }

  public Population getPopulation() {
    return population;
  }

  public TotalCaseCount getTotalCaseCount() {
    return totalCaseCount;
  }

  public TwoWeekCaseCount getTwoWeekCaseCount() {
    return twoWeekCaseCount;
  }

  public TotalTestCount getTotalTestCount() {
    return totalTestCount;
  }

  public TwoWeekTestCount getTwoWeekTestCount() {
    return twoWeekTestCount;
  }

  public TotalPositiveTestCount getTotalPositiveTestCount() {
    return totalPositiveTestCount;
  }

  public TestingRate getTestingRate() {
    return testingRate;
  }

  public ReportDate getReportDate() {
    return reportDate;
  }
}
