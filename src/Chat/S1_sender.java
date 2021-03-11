package Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class S1_sender {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(8888);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String data = reader.readLine();
            byte[] bytes = data.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",6666));

            socket.send(packet);
            if (bytes.equals("bye")){
                break;
            }
        }
        socket.close();


    }
}
