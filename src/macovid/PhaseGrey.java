package macovid;

public class PhaseGrey extends Phase{
  private String color = "Grey";

  public PhaseGrey(String color) {
    super(color);
  }

  @Override
  public void displayPhase() {
    System.out.printf("Your state is in Phase %s%n.", this.color);
  }
}
