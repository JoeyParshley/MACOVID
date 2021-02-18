package macovid.dataMembers;

public class TwoWeekCaseCount extends DataMember{
  int value;
  public TwoWeekCaseCount(Integer value) {
    super(value);
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
