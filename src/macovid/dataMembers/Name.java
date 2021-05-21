package macovid.dataMembers;

public class Name extends DataMember{
  private String value;

  public Name(String value) {
    super(value);
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
}
