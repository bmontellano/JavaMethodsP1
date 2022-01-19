package classes;

public class LogFile {
    private String fileName = "Logfile.log";
    private String filePath = "/var/Log/";

    public LogFile(){
        System.out.println("Default constructor for LogFile class");
    }

    public LogFile(String fileName, String filePath){
        System.out.println("Parameterized constructor");
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public void writeLog(String line) {
        System.out.println(filePath + fileName + " - " + line);
    }

    
}
