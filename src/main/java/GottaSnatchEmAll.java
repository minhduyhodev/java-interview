import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {
    // GottaSnatchEmAll.newCollection(List.of("Newthree", "Newthree", "Newthree"));
    // // => {"Newthree"}
    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<>(cards);
        return set;

    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            Set<String> currentSet = collections.get(i);
            Set<String> toRemove = new HashSet<>();

            for (String string : result) {
                if (!currentSet.contains(string)) {
                    toRemove.add(string);
                }
            }
            result.removeAll(toRemove);
        }

        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            result.addAll(collections.get(i));
        }

        return result;
    }
}