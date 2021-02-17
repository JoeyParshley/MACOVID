package macovid;

public class PhaseRed extends Phase{
  private String color = "Red";

  public PhaseRed(String color){
    super(color);
  }

  @Override
  public void displayPhase() {
    System.out.printf("Your state is in Phase %s%n.", this.color);
  }
}
