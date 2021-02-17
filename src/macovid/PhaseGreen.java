package macovid;

import java.util.ArrayList;

public class PhaseGreen extends Phase{
  private String color = "Green";
  private ArrayList<Phase> thePhases = new ArrayList<Phase>();

  public PhaseGreen(String color) {
    super(color);
  }

  @Override
  // Use polymorphism to display the phase color name based on which phase class is used
  public void displayPhase() {
    System.out.printf("Your state is in Phase %s%n.", this.color);
  }

  public void displayAllPhases(){
    // Postcondition: All phases are displayed per Phase.displayPhase()
    // display the current phase
    displayPhase();

    // display the other phases
    for (Phase phase: thePhases){
      if (phase instanceof Phase) {
        ((Phase)phase).displayPhase();
      } else {
        phase.displayPhase();
      }
    }

  }
}
