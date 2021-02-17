package macovid;

/**
 *  Phase:        The category of infection rate for the city or town based on population
 *                There are 4 phases
 *    - Red:      - Greater than 25 total cases for population under 10k
 *                - Greater than or egual to 10 average cases/100k AND
 *                  greater than or equal to 5% positivity rate for 10k - 50k population
 *                - Greater than or egual to 10 average cases/100k AND
 *                  greater than or equal to 5% positivity rate for over 50k population
 *    - Yellow:   - Less than or equal to 25 total cases for population under 10k
 *                - Greater than or egual to 10 average cases/100k OR
 *                  greater than or equal to 5% positivity rate for 10k - 50k population
 *                - Greater than or egual to 10 average cases/100k OR
 *                  greater than or equal to 5% positivity rate for over 50k
 *    - Green:    - Less than or equal to 15 total cases for population under 10k
 *                - Less than 10 average cases/100k AND
 *                  greater than 10 total cases for 10k - 50k population
 *                - Less than or egual to 10 average cases/100k AND
 *                  greater than 15 total cases for over 50k
 *    - Grey:     - Less than or equal to 10 total cases for population under 10k
 *                - Less than or equal to 10 total cases/100k for 10k - 50k population
 *                - Less than or equal to 15 total cases/100k rate for over 50k
 */

public abstract class Phase {
  protected String color = "n/a";

  public Phase(){}

  public Phase(String colorName){
    color = colorName;
  }

  public String getColor() {
    return color;
  }

  // displayPhase is used to show the color of the determined phase in the test results
  public abstract void displayPhase();
}
