package macovid.dataMembers;

public class TotalCaseCount  extends DataMember{
  int value;

  public TotalCaseCount(Integer value) {
    super(value);
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }
}
