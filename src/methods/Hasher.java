package methods;

import java.util.HashMap;
import java.util.HashSet;

public class Hasher {
    /**
     * 
     */
    private HashMap<String, String> stateCapitals = new HashMap<>();
    private HashSet<String> bestCities = new HashSet<>();

    public HashMap<String, String> getStateCapitals() {
        return stateCapitals;
    }

    public HashSet<String> getBestCities() {
        return bestCities;
    }

    public void setBestCities(HashSet<String> bestCities) {
        this.bestCities = bestCities;
    }

    public void setStateCapitals(HashMap<String, String> stateCapitals) {
        this.stateCapitals = stateCapitals;
    }

    /**This Demos adding and printing a HashMap. */
    public static void demoHashMap(){
        //method below has a significant performance difference when compared to
        //adding key/value pairs to the stateCaps Map using the put method separately 
        long st = System.currentTimeMillis();
        HashMap<String, String> stateCapitallls = new HashMap<>()
        {{
            put("CA","Sacramento");
            put("WA","Olympia");
            put("OR","Salem");
            put("IO","Des Moines");
        }};
        System.out.println("Performance Test: " + (System.currentTimeMillis() - st));
        System.out.println(stateCapitallls);
        //add to Map after initializing
        stateCapitallls.put("AZ","Phoenix");

        //Let's remove an key/value set and add another
        stateCapitallls.remove("IO");
        stateCapitallls.put("IA", "Des Moines");

        //Check to see if hashmap contains particular key
        for (String str : stateCapitallls.keySet()){
            if (!stateCapitallls.containsKey(str + "grrrrrrrr")) {
                System.out.println("key " + str + "grrrrrrrr" + " is not in this Map.");  
            } 
            if (stateCapitallls.containsKey(str)) {
                System.out.println("key " + str + " is in this Map.");
            }
        }

        //See number of elements in a Map
        System.out.println("stateCapitallls map number of elements == " + stateCapitallls.size());

        // Printing keys and values
        System.out.println("Printing Keys and Values below");
            for(String v : stateCapitallls.keySet()) {
         System.out.println("key: " + v + " value: " + stateCapitallls.get(v));
        }
    }

    public static void demoHashSet(){

        //HashSets contain lists of objects that are unique

        HashSet<String> bestCitiez = new HashSet<>();
        bestCitiez.add("Los Angeles");
        System.out.println(bestCitiez);
        //adding Los Angeles again will do nothing
        bestCitiez.add("Los Angeles");
        bestCitiez.add("Austin");
        bestCitiez.add("New York City");
        System.out.println(bestCitiez);
        //check to see if a value is contained within the Set
        System.out.print("Does set contain \"San Francisco\"? " + bestCitiez.contains("San Francisco"));
    }

    
}
