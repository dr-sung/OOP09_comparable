
import java.util.*;

public class CountryComparatorByPopulation implements Comparator<Country>
{
  @Override
   public int compare(Country country1, Country country2)
   {
      if (country1.getPopulation() < country2.getPopulation()) {
          return -1;
      } else if (country1.getPopulation() > country2.getPopulation()) {
          return 1;
      } else {
          return 0;
      }
   }

}
