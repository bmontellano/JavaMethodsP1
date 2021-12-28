package methods;

//Don't be lazy, use logger

import java.util.Date;

public class Calculator {

    public double cubedRoot(double x) {
        return Math.pow((1/3), x);
    }

    /**
     * 
     * @param x
     * @param y
     * @return
     */
    public double addThese(double x, double y){
        return x + y;
    }

    /**
     * Overloading can occur in 3 different ways
     * differences in the following:
     * 1. number of params
     * 2. types of params
     * 3. order of params
     */

    /**
     * OVERLOAD
     * @param x
     * @param y
     * @param z
     * @return
     */
    public double addThese(double x, double y, double z){
        return x + y + z;
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!!");
    }

    public static void dateToday(){
        Date newDate = new Date();
        System.out.println(newDate);
    }

}
