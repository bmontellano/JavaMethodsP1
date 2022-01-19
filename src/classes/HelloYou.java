package classes;

public class HelloYou {
    private String you = "";

    public HelloYou(String you){
        this.you = you;
    }

    public void printHello() {
        System.out.println("Hello, " + this.you + "!");
    }
}
