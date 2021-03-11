package Chat;

public class S2_teacher {
    public static void main(String[] args) {
        new Thread(new S2_Client(5555,"localhost",8888)).start();
        new Thread(new S2_Server(9999,"学生")).start();
    }
}
