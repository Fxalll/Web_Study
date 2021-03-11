package Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class S1_receiver {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(6666);
        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
            socket.receive(packet);
            String receiveData = new String(bytes,0, bytes.length);
            System.out.println(receiveData);

            if (receiveData.equals("bye")){
                break;
            }
        }

        socket.close();

    }
}
