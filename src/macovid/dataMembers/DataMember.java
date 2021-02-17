package macovid.dataMembers;

public class DataMember<T> implements GenericDataMember<T> {
  private String label;
  private T value;

  public DataMember(String label, T value){
    this.label = label;
    this.value = value;
  }

  @Override
  public void setValue(T value) { this.value = value; }

  @Override
  public String toString() { return this.label + ": " + this.value; }
}
