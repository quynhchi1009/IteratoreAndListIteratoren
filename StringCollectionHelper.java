package edu.hm.cs.bka.dev2.collections;

import java.util.*;

/**
 * Hilfsklasse zum Umgang mit Collections-Klassen zur Verwaltung von Strings.
 */
public class StringCollectionHelper {



  /**
   * Liefert alle Elemente einer Collection zurück, die einen gegebenen Teilstring (Muster)
   * enthalten. Dabei kann angegeben werden, ob die Groß/Kleinschreibung berücksichtigt werden
   * soll.
   *
   * @param strings       Collection mit Strings
   * @param muster        zu suchender (Teil)-String (Muster)
   * @param caseSensitive gibt an, ob Groß/Kleinschreibung berücksichtigt werden soll.
   * @return Alle Elemente der Collection, die das Muster als Teilstring enthalten.
   */
  public static Set<String> selectContaining(Collection<String> strings, String muster,
                                             boolean caseSensitive) {
    // TODO: Implementieren (Teilaufgabe 1)
    Set<String> result = new HashSet<>();
    if (caseSensitive) {
      for (String x : strings) {
        if (x.contains(muster)) {
          result.add(x);
        }
      }
    } else {
      for (String x : strings) {
        String y = x.toLowerCase();
        if (y.contains(muster.toLowerCase())) {
          result.add(x);
        }
      }
    }
    return result;
  }

  /**
   * Ersetzt direkte einfache oder mehrfache Wiederholungen eines Elements durch einen String der
   * Form "*3".
   */
  public static void countDuplicates(List<String> list) {
    // TODO: Implementieren (Teilaufgabe 2)
    ListIterator<String> iterator = list.listIterator();
    int count = 1;
    while (iterator.hasNext()) {
      String o = iterator.next();
      if (iterator.hasNext()) {
        String next = iterator.next();
        if (o.equals(next)) {
          while (o.equals(next)) {
            count++;
            iterator.remove();
            if (iterator.hasNext()) {
              next = iterator.next();
            } else {
              iterator.add("*" + count);
              return;
            }
          }
          iterator.previous();
          iterator.add("*" + count);
          count = 1;
        }
        if (iterator.hasPrevious()) {
          iterator.previous();
        }
      }
    }
  }
}
