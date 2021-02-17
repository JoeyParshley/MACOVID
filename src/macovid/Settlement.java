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

}
