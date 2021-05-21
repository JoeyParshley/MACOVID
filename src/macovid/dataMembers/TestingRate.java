package macovid.dataMembers;

public class TestingRate  extends DataMember{
  double value;

  public TestingRate(Double value) {
    super(value);
    this.value = value;
  }
  public double getValue() {
    return this.value;
  }
}
