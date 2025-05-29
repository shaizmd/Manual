
import java.io.*;
import java.net.*;

public class Serverside{
    public static void main(String args[]){
        try {
            ServerSocket ss = new ServerSocket(3306);

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String str = dis.readUTF();

            System.out.println("Message:"+str);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}