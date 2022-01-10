package methods;

import java.util.Scanner;

import javax.swing.text.DefaultCaret;

public class DecisionEngine {
    static Scanner input = new Scanner(System.in);
    

    public static void ifStatementDemo(){
        System.out.println("Enter an integer:");
        int integerValue = input.nextInt();
        if(integerValue == 0 || integerValue == 1){
            System.out.println("Chosen integer is either 0 or 1.");
        } else if (integerValue == 2) {
            System.out.println("Chosen integer is either 2.");
        } else {
            System.out.println("Chosen integer is not 1,2 nor 3.");
        }

        if(integerValue % 2 == 0) {
            System.out.println("Chosen integer is even.");
        } else {
            System.out.println("Chosen integer is odd.");
        }
        input.close();
    }
    
    public static void switchStatementDemo(){
        System.out.println("Enter an integer:");
        int integerValue = input.nextInt();
        switch(integerValue) {
            case 0:
            System.out.println("Zero");
            break;
            case 1: 
            System.out.println("One");
            break;
            default: 
            System.out.println("Chosen int is ---> " + integerValue);
        }
        input.close();
    }

    public static void checkStringEqualityDemo(){
        String str1 = "Mio caro";
        String str2 = "Mio";
        String str3 = " caro";
        String str4 = str2 + str3;

        System.out.println("str1 is: " + str1);
        System.out.println("str2 is: " + str2);
        System.out.println("str3 is: " + str3);
        System.out.println("str4 is str2 and str3 added together: " + str4);

        System.out.println(str1 == str4);
        System.out.println(str1.equals(str4));

        System.out.println("compareTo(STRING_OBJ) will return 0 if the strings are exactly the same.");
        System.out.println("Otherwise, compareTo() will return > 0 if the compared word is lexicographically greater than");
        System.out.println("compareTo() will return < 0 if the compared word is lexicographically lesser than");
        System.out.println("upper case letters come before lower case letters");
        System.out.println("compareTo() also ONLY compares the first character of the string");
        System.out.println(str1.compareTo(str4));
    }
   
    
}
