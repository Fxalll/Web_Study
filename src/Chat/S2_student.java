package Chat;

public class S2_student {
    public static void main(String[] args) {
        new Thread(new S2_Client(7777,"localhost",9999)).start();
        new Thread(new S2_Server(8888,"老师")).start();
    }
}
