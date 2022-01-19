package classes;

public class TextDocument extends DocumentAbstract {

    public TextDocument(){
        this.setFileName("untitled.txt");
    }

    public void displayContents(){
        System.out.println(getContents());
    }
    
}
