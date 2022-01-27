import java.util.ArrayList;
import java.util.Arrays;

import classes.DocumentAbstract;
import classes.HTMLDocument;
import classes.HTTPLogFile;
import classes.HelloYou;
import classes.LogFile;
import classes.OuterInner;
import classes.TextDocument;
import math.JavaMathClassOne;
import methods.ArrayMachine;
import methods.Calculator;
import methods.DecisionEngine;
import methods.Hasher;
import methods.Looper;

public class App {
    public static void main(String[] args) {   
        System.out.println("Hello, User!");
        /*
        //We can call this static method without instantiating the Calculator class
        Calculator.printHelloWorld();
        Calculator.dateToday();
        ArrayMachine newArrayMachine = new ArrayMachine();
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("a","b","hello","I","am","iterating."));
        newArrayMachine.setStringArrayList(stringArrayList);
        //below are the demos
        newArrayMachine.demoIterator();
        newArrayMachine.demoIteratorReverse();
        newArrayMachine.demoLinkedList();
        //Hasher.demoHashMap();
        //Hasher.demoHashSet();
        //Looper.loopDoWhileFun();
        //DecisionEngine.ifStatementDemo();
        //DecisionEngine.switchStatementDemo();
        //DecisionEngine.checkStringEqualityDemo();
        */
        /*
        HelloYou helloThere = new HelloYou("There");
        helloThere.printHello();
        HelloYou helloAlonso =  new HelloYou("Alonso");
        helloAlonso.printHello();
        // LogFile log = new HTTPLogFile("example.com");
        // log.writeLog("index.html - 200 OK 192.168.2.1");   
        */
       /*
        DocumentAbstract htmlDoc = new HTMLDocument();
       htmlDoc.setContents("<p>This is in the HTML Document.</p>");
       htmlDoc.displayContents();

       DocumentAbstract txtDoc = new TextDocument();
       txtDoc.setContents("This is in the text document");
       txtDoc.displayContents();
        */
       /* Implement Outer Inner classes
        OuterInner out = new OuterInner();
        System.out.println(out.getInnerMessage("Hi, Brian!"));

        OuterInner.Inner in = out.getInner("Hello World!");
        System.out.println(in);
        */
        
        JavaMathClassOne exampleOne = new JavaMathClassOne();
        JavaMathClassOne exampleTwo = new JavaMathClassOne(-100, 55);
        exampleOne.findMin();
        exampleTwo.findAbsoluteValues();
        exampleOne.roundUp(100.49999);
        exampleOne.roundUp(100.50001);
        exampleOne.findSquareRoot();
        exampleTwo.findSquareRoot(); //The first number is negative and therefore sqrt of neg will return NaN (Not a Number)
        exampleOne.eulersNumberToThePowerOf(3);
        exampleOne.eulersNumberToThePowerOfxMinusOne(3);
        exampleTwo.findDiffernce();
        exampleTwo.findSum();
        exampleOne.findProduct();
        
    }
}
