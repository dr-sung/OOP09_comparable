
public class Country implements Comparable<Country>
{

   public Country(String name, double area, int population)
   {
      this.name = name;
      this.area = area;
      this.population = population;
   }

   public String getName()
   {
      return name;
   }

   public double getArea()
   {
      return area;
   }
   
   public int getPopulation() {
       return population;
   }


   /**
      Compares two countries by area.
      @param other the other country
      @return a negative number if this country has a smaller
      area than otherCountry, 0 if the areas are the same,
      a positive number otherwise
   */
   @Override
   public int compareTo(Country other)
   {
       // lexicographic ordering based on 'name' from String class
      return name.compareTo(other.getName());
   }

   @Override
   public String toString() {
     return name + "(" + area + " square km, " + population + " people)";
   }

   private final String name;
   private final double area;
   private final int population;

}

