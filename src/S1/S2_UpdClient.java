package S1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class S2_UpdClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        String msg = "hello!";
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.length(),localhost,port);
        socket.send(packet);
        socket.close();
    }
}
