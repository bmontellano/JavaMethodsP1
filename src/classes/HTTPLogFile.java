package classes;

public class HTTPLogFile extends LogFile {

    public HTTPLogFile(String siteName){
        super(siteName + ".log", "/var/Log/");
    }
}
