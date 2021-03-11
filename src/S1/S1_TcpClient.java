package S1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class S1_TcpClient {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os =null;
        try {
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            socket = new Socket(serverIP,port);
            os = socket.getOutputStream();
            os.write("hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
