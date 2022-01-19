package classes;

public class HTMLDocument extends DocumentAbstract{
    private String header;

    public HTMLDocument(String header) {
        this.header = header;
    }

    public HTMLDocument(){
        this.setFileName("index.html");
    }

    @Override
    public void displayContents(){
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println(header);
        System.out.println("</head><body>");
        System.out.println(getContents());
        System.out.println("</body></html>");
    }
}
