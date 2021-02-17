package macovid;

public class PhaseYellow extends Phase{
  private String color = "Yellow";

  public PhaseYellow(String color){
    super(color);
  }

  @Override
  public void displayPhase() {
    System.out.printf("Your state is in Phase %s%n.", this.color);
  }
}
