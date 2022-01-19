package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Looper {

    static String[] faveColours = {"red", "blue", "pink", "gold", "turquoise"};
    static int[] integerSample = {0,1,2,3,4,5};

    public static void loopForFun(){
        //print favorite colours
        System.out.println("Printing favorite colours.");
        for(int i = 0; i < faveColours.length; i++){
            System.out.println(faveColours[i]);
        }
    }

    public static void loopReverseForFun(){
        System.out.println("Printing favorite colours in reverse.");
        //print favorite colours in reverse
        for(int i = faveColours.length - 1; i > -1; i--){
            System.out.println(faveColours[i]);
        }
    }

    public static void enhancedLoopFun() {
        System.out.println("Printing integers in an enhanced loop");
        for(int i : integerSample){
            System.out.println(i);
        }
    }

    public static void convertToListLoopFun(){
        System.out.println("converting fave colours to List");
        ArrayList<String> faveColours2 = new ArrayList<>(Arrays.asList(faveColours));
        faveColours2.add("violet");
        faveColours2.add("baby-blue");
        System.out.println("Since converting to ArrayList, now the Array has become mutable, and we can add items. Here is the new list with added items");
        System.out.println(faveColours2);  
        System.out.println("using Collections to reverse the list and then printing.");        
        Collections.reverse(faveColours2);
        for(String  colour : faveColours2){
            System.out.println(colour);
        }

    }

    public static void loopWhileFun(){
        int iterator = 0;
        
        while(iterator < faveColours.length) {
            System.out.println(faveColours[iterator]);
            iterator++;
        }
    }

    public static void loopDoWhileFun(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 6);
    }
}
