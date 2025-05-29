
import java.net.URL;



public class Urlcomp{
    public static void main(String args[]){
        try {
            URL url = new URL("https://www.example.com/path/tofind/file.html?key=value#fragment");
            System.out.println("Protocol:"+url.getProtocol());
            System.out.println("Host:"+url.getHost());
            System.out.println("Port:"+url.getPort());
            System.out.println("Path:"+url.getPath());
            System.out.println("Query:"+url.getQuery());
            System.out.println("Fragment:"+url.getRef());
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
    }
}