package macovid;

/**
 * Municipality class will have the municipalities data it will be
 */
public class CityTown {
  private String name;
  private int population;

  @Override
  public String toString() {
    return  String.format("%n%-30s%10d",name,population);
  }

  public CityTown(String name, int population) {
    this.name = name;
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }
}
