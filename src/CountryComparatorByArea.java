
import java.util.*;

public class CountryComparatorByArea implements Comparator<Country> {

  @Override
  public int compare(Country first, Country second) {
    double firstArea = first.getArea();
    double secondArea = second.getArea();
    if (firstArea < secondArea)
      return -1;
    else if (firstArea > secondArea)
      return 1;
    else
      return 0;
  }

}
