import java.util.*;

public class a_11_14 {

    /*
    14. Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
    and returns a new map containing only the key/value pairs that exist in both of the parameter maps. In order for a
    key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, but they need
    to map it to the same value. For example, if the two maps passed are {Janet=87, Logan=62, Whitaker=46,
    Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and {Logan=62, Kim=52, Whitaker=52,
    Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}, your method would return the following new map
    (the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52}.
     */

    public static void main(String[] args) {

        Map<String, Integer> testMap1 = new HashMap<>();
        Map<String, Integer> testMap2 = new HashMap<>();
        String resultString = "Result should be: \n{Logan=62, Stefanie=80, Jeff=88, Kim=52}";

        // {Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
        testMap1.put("Janet", 87);
        testMap1.put("Logan", 62);
        testMap1.put("Whitaker", 46);
        testMap1.put("Alyssa", 100);
        testMap1.put("Stefanie", 80);
        testMap1.put("Jeff", 88);
        testMap1.put("Kim", 52);
        testMap1.put("Sylvia", 95);

        //{Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}
        testMap2.put("Logan", 62);
        testMap2.put("Kim", 52);
        testMap2.put("Whitaker", 52);
        testMap2.put("Jeff", 88);
        testMap2.put("Stefanie", 80);
        testMap2.put("Brian", 60);
        testMap2.put("Lisa", 83);
        testMap2.put("Sylvia", 87);

        System.out.println(resultString);
        System.out.println("Result is:\n" + intersect(testMap1, testMap2));
    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {

        // makes a set containing all keys of map1
        Set<String> setOfKeys = map1.keySet();

        // creates an iterator to loop through every element in setOfKeys
        Iterator<String> iter = setOfKeys.iterator();

        // the map to return
        Map<String, Integer> returnMap = new HashMap<>();

        // runs as long as the iteration has more elements
        while (iter.hasNext()) {

            // sets the current element in the iterator to key variable
            String key = iter.next();

            // if map2 has a key that matches the key variable (the key from map1)
            // and the value of the key in map1 and map2 is the same, the key and value is added to the returnMap
            // since they are in both maps
            if (map2.containsKey(key) && map1.get(key) == map2.get(key)) {

                returnMap.put(key, map1.get(key));
            }
        }

        return returnMap;
    }
}
