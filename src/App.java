import methods.Calculator;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, User!");

        //We can call this static method without instantiating the Calculator class
        Calculator.printHelloWorld();
    }
}
