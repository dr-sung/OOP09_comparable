
import java.util.*;

public class CountrySortTester
{
   public static void main(String[] args)
   {
      ArrayList<Country> countries = new ArrayList<>();

      countries.add(new Country("Russia", 17098242));
      countries.add(new Country("Canada", 9984670));
      countries.add(new Country("China", 9596961));
      countries.add(new Country("USA", 9629091));
      countries.add(new Country("Brazil", 8514877));
      countries.add(new Country("Australia", 7692024));

      //============= using Comparable
      //              sorting key is defined in Country class

      Collections.sort(countries);
      // Now the array list is sorted by area
      System.out.println("\n------ sorted by area using 'Comparable'------");
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());

      //============== using Comparator
      //               you can change sorting key dynamically

      // sort by name using 'Comparator'
      Comparator<Country>  compName = new CountryComparatorByName();

      Collections.sort(countries, compName);
         // Now the array list is sorted by area
      System.out.println("\n------ sorted by name using 'Comparator'------");
      for (Country c : countries)
        System.out.println(c);

      // sort by area using 'Comparator'
      Comparator<Country> compArea = new CountryComparatorByArea();

      Collections.sort(countries, compArea);

      System.out.println("\n------ now sorted by area using 'Comparator'------");
      for (Country c : countries)
        System.out.println(c);
   }
}
