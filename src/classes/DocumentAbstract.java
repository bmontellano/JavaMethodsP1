package classes;

public abstract class DocumentAbstract {
    
    private String contents;
    private String fileName;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public abstract void displayContents();

   
}
