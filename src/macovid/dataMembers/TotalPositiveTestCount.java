package macovid.dataMembers;

public class TotalPositiveTestCount extends DataMember{
  int value;

  public TotalPositiveTestCount(Integer value) {
    super(value);
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
