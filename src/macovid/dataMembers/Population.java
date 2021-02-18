package macovid.dataMembers;

public class Population extends DataMember{
  int value;

  public Population(Integer value) {
    super(value);
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}

