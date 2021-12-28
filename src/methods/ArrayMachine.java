package methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class ArrayMachine {

    //Don't be lazy, use logger
    public static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Arrays and ArrayLists
     * 
     * ArrayLists can be slower than Arrays
     * 
     *
     *  ----Similarities:
     * Store elements
     * Can store null values
     * Can store duplicate objects
     * Element order not preserved
     * 
     *  ----Differences:
     * ::Array::
     * Dynamically created object
     * Fixed size
     * Size must be established at declaration
     * Stores objects and primitives
     * 
     * ::ArrayList::
     * Class of Collections framework
     * Size is dynamic
     * Size not necessary at declaration
     * Stores objects only
     * 
     */
    
    private ArrayList<String> stringArrayList;
    private int[] integerArray = new int[9]; // ---> defines an array of 10 integers

    public List<String> getStringArrayList() {
        return stringArrayList;
    }

    public int[] getIntegerArray() {
        return integerArray;
    }

    public void setIntegerArray(int[] integerArray) {
        this.integerArray = integerArray;
    }

    public void setStringArrayList(List<String> stringArrayList) {
        this.stringArrayList = (ArrayList<String>) stringArrayList;
    }

    //Overload, in case an ArrayList is passed
    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList =  stringArrayList;
    }

    //below method uses standard for loop to add elements to integer array
    public void addIntegersWithForLoop(){
        for(int i = 0; i < this.integerArray.length; i++) {
            integerArray[i] = i;
        }
    }

    //below method does the same as above, except with the new for-each loop
    public void addIntegersWithForEachLoop(){
       for(int i : integerArray) {
           integerArray[i] = i;
       }
    }

    

    //Here, we create an iterator to, you guessed it, 
    //to iterate through the collection that is the ArrayList
    //First we import the Iterator class
    public void demoIterator () {
        Iterator<String> myIterator = this.stringArrayList.iterator();
        System.out.println(this.stringArrayList);
        StringBuilder newSB = new StringBuilder();
        while(myIterator.hasNext()) {
            newSB.append(myIterator.next() + " ");
            //LOGGER.info(myIterator.next());
            //LOGGER is heavy with too much information
            //All I want for Christmas is a simple and sweet logger
            //that only prints the text, PLEASE!
        }
        System.out.println(newSB.toString());
    }
}
