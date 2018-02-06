import java.net.*;
import java.io.*;

public class Question3 {

    public static void main(String [] args) {
        try {
            URL url = new URL("http://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2#htc");

            System.out.println("URL is " + url.toString());
            System.out.println("protocol is " + url.getProtocol());
            System.out.println("authority is " + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is " + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}