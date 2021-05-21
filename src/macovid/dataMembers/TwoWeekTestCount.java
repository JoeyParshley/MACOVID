package macovid.dataMembers;

public class TwoWeekTestCount  extends DataMember{
  int value;

  public TwoWeekTestCount(Integer value) {
    super(value);
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
