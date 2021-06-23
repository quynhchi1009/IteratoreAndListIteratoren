# IteratoreAndListIteratoren
1.1 Selection of strings optionally with upper and lower case letters:
The method selectContaining is to return from a set of strings those which contain a given substring. The consideration of the upper and lower case should be optional.

Collection<String> strings = Lists.newArrayList("Eins", "Zwei", "DREI", "vier");
folgende Aufrufe die kommentierten Ergebnisse haben (Reihenfolge der Ergebnisse ist egal!)
// Output [DREI, Eins, Zwei]
System.out.println(StringCollectionHelper.selectContaining(strings, "ei", false)); // Output [Zwei]
System.out.println(StringCollectionHelper.selectContaining(strings, "ei", true)); // Output [vier, Zwei]
System.out.println(StringCollectionHelper.selectContaining(strings, "e", true)); // Output []
System.out.println(StringCollectionHelper.selectContaining(strings, "y", false));
  
1.2 Count duplicates
The generic method replaceDuplicates is intended to delete direct repetitions (single or multiple) in an arbitrary list and replace them with a string of the form *x for the number of repetitions (total):
  
List<String> names =
    Lists.newArrayList("Tick", "Trick", "Trick", "Trick", "Track","Donald", "Donald", "Trick");
  
  
// Output: [Tick, Trick, *3, Track, Donald, *2, Trick]
StringCollectionHelper.countDuplicates(names);
System.out.println(names);
