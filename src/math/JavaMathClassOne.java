package math;

public class JavaMathClassOne {
    private int a = 100;
    private int b = 5;
    private static final String AND = " and ";

    public JavaMathClassOne(){
        System.out.println("Default Constructor with initiated values 100.");
    }

    public JavaMathClassOne(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Custom Constructor with initiated values " + a + AND + b);
    }

    public void findMin(){
        System.out.println("Smaller value out of " + this.a + AND + this.b + " is: " + Math.min(this.a,this.b));
    }

    public void findAbsoluteValues(){
        System.out.println("Abs Values of " + this.a + AND + this.b + " are (" + Math.abs(this.a) + "," + Math.abs(this.b) + ")" );
    }

    public void roundUp(double a){
        System.out.println("The rounded value of " + a + " is: " + Math.round(a));
    }

    public void findSquareRoot(){
        System.out.println("The squareRoots of the initiaded values are " + Math.sqrt(this.a) + AND + Math.sqrt(this.b)); 
    }

    public void eulersNumberToThePowerOf(int z){
        System.out.println("Euler's number to the power of " + z + " is: " + Math.exp(z));
    }

    public void eulersNumberToThePowerOfxMinusOne(int z){
        System.out.println("Euler's number to the power of " + z + " is: " + Math.expm1(z));
    }

    public void findSum(){
        System.out.println("The sum of the initiaded values is " + Math.addExact(this.a, this.b)); 
    }

    public void findDiffernce(){
        System.out.println("The difference of the initiaded values is " + Math.subtractExact(this.a, this.b)); 
    }

    public void findProduct(){
        System.out.println("The product of the initiaded values is " + Math.multiplyExact(this.a, this.b)); 

    }
}
