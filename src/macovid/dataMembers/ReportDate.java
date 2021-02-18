package macovid.dataMembers;

public class ReportDate extends  DataMember{
  private String value;

  public ReportDate(String value) {
    super(value);
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}