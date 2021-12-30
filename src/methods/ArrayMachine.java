package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
    
    /**
     * LinkedList
     * 
     * LinkedList has the same methods as ArrayList, and has some extra methods
     * Especially if you care about the order of the items
     * 
     * addFirst(), addLast() --> add to the beginning or end of a LinkedList
     * ex. myLinkedList.addLast("Rodrigo")
     * getFirst(), getLast() --> get first or last item in LinkedList
     * removeFirst(), removeLast() --> remove items
     * 
     * 
     */

    private ArrayList<String> stringArrayList;
    private int[] integerArray = new int[9]; // ---> defines an array of 10 integers
    private LinkedList<Integer> integerLinkedList = new LinkedList<>();

    public List<String> getStringArrayList() {
        return stringArrayList;
    }

    public LinkedList<Integer> getIntegerLinkedList() {
        return integerLinkedList;
    }

    public void setIntegerLinkedList(LinkedList<Integer> integerLinkedList) {
        this.integerLinkedList = integerLinkedList;
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

    /** demoIterator ** 
     Here, we create an iterator to, you guessed it, 
     to iterate through the collection that is the ArrayList. 
    Iterator class found in java.utils.
    */
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

    //
    public void demoIteratorReverse() {
        //We can use ListIterator
        ListIterator<String> myListIterator = this.stringArrayList.listIterator();
        StringBuilder newSB = new StringBuilder();
        while(myListIterator.hasPrevious()) {
            newSB.append(" " + myListIterator.previous());
         }
         if (!newSB.toString().isEmpty()){
             System.out.println(newSB.toString());
         } else {
             System.out.println("Awwww, sorry, the string is empty because you tried to go backward and there are no previous items.\nWhy? Because we haven't iterated through the list yet! Please iterate ^^");
         }
        //below will do nothing unless we first iterate through all the items
        while(myListIterator.hasNext()){
            myListIterator.next();
        }
        //after iterating, how we will get a print
        while(myListIterator.hasPrevious()) {
            if(!myListIterator.hasNext()){
                newSB.append(myListIterator.previous());
            } else {
                newSB.append(" " + myListIterator.previous());
            }
            
         }
        System.out.println(newSB.toString());
    }

    public void demoLinkedList(){
        //Here are all the LinkedList methods
        //First we see that the LinkedList is empty
        System.out.println("should return empty list --> " + this.getIntegerLinkedList());
        //.push --> pushes item to the beginning
        this.getIntegerLinkedList().push(1);
        this.getIntegerLinkedList().push(22);
        this.getIntegerLinkedList().push(33);
        System.out.println(this.getIntegerLinkedList());
        System.out.println("Getting first item --> " + this.getIntegerLinkedList().getFirst());
        System.out.println("Getting last item --> " + this.getIntegerLinkedList().getLast());
        this.getIntegerLinkedList().addFirst(0);
        System.out.println(this.getIntegerLinkedList());
        //.peek --> returns the first item of the LinkedList
        System.out.println("peeking --> " + this.getIntegerLinkedList().peek());
        //.pop --> removes the first item of the LinkedList
        this.getIntegerLinkedList().pop();
        System.out.println("After pop --> " + this.getIntegerLinkedList());
    }
}
