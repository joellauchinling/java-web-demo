import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerNotHangUp {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3000);
            Socket socket = ss.accept();

            while (socket != null) {
                new ClientConnection(socket).start();
                socket = ss.accept();
            }

            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

