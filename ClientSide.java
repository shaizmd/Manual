
import java.io.DataOutputStream;
import java.net.Socket;



public class ClientSide{
    public static void main(String[] args) {
      try {
          Socket s = new Socket("localhost", 3306);
          DataOutputStream dout = new DataOutputStream(s.getOutputStream());
          dout.writeUTF("Hello Server");
          dout.flush();
          dout.close();
      } catch (Exception e) {
        System.out.println(e);
      }


    }
}