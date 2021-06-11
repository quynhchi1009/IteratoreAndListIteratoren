package edu.hm.cs.bka.dev2.collections;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

/**
 * Beispiele für die Klasse {@link StringCollectionHelper}.
 */
public class StringCollectionHelperDemo {

  /**
   * Beispielprogramm.
   *
   * @param args wird nicht genutzt
   */
  public static void main(String[] args) {

    Collection<String> strings = Lists.newArrayList("Eins", "Zwei", "DREI", "vier");
    // Sollte ausgeben [Eins, Zwei, DREI]
    System.out.println(StringCollectionHelper.selectContaining(strings, "ei", false));
    // Sollte ausgeben [Zwei]
    System.out.println(StringCollectionHelper.selectContaining(strings, "ei", true));
    // Sollte ausgeben [Zwei, Vier]
    System.out.println(StringCollectionHelper.selectContaining(strings, "e", true));
    // Sollte ausgeben []
    System.out.println(StringCollectionHelper.selectContaining(strings, "y", false));

    List<String> names = Lists.newArrayList("Tick", "Trick", "Trick", "Trick", "Track",
        "Donald", "Donald", "Trick");
    // Sollte ausgeben: [Tick, Trick, *3, Track, Donald, *2, Trick]
    StringCollectionHelper.countDuplicates(names);
    System.out.println(names);
  }
}
