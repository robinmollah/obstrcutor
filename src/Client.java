import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        for(int i = 0; i < 5; i++){
            socket = new Socket("192.168.0.100", 1337);

            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("Sending this message to server index " + i);
        }
    }
}
