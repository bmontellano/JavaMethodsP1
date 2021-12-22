package methods;

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
