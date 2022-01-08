import java.util.ArrayList;
import java.util.Arrays;

import methods.ArrayMachine;
import methods.Calculator;
import methods.Hasher;
import methods.Looper;

public class App {
    public static void main(String[] args) {   
        System.out.println("Hello, User!");

        //We can call this static method without instantiating the Calculator class
        /*
        Calculator.printHelloWorld();
        Calculator.dateToday();
        ArrayMachine newArrayMachine = new ArrayMachine();
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("a","b","hello","I","am","iterating."));
        newArrayMachine.setStringArrayList(stringArrayList);
        //below are the demos
        newArrayMachine.demoIterator();
        newArrayMachine.demoIteratorReverse();
        newArrayMachine.demoLinkedList();
        */
        //Hasher.demoHashMap();
        //Hasher.demoHashSet();
        Looper.loopDoWhileFun();

    }
}
