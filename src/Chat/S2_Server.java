package Chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class S2_Server implements Runnable{
    DatagramSocket socket = null;
    DatagramPacket packet = null;
    private int port;
    private String msgFrom;
    public S2_Server(int port,String msgFrom){
        this.port = port;
        this.msgFrom = msgFrom;

        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run(){
        while (true){
            try {
                byte[] bytes = new byte[1024];
                packet = new DatagramPacket(bytes,0,bytes.length);
                socket.receive(packet);
                String receiveData = new String(bytes,0, bytes.length);
                System.out.println(msgFrom + ": " +receiveData);

                if (receiveData.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();

    }


}