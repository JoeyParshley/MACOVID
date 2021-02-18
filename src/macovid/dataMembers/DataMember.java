package macovid.dataMembers;

public class DataMember<T> implements GenericDataMember<T> {
  private T value;

  public DataMember(T value){
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  @Override
  public void setValue(T value) {}
}
