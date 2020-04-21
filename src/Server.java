import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(1337);

        while(true){
            System.out.println("Waiting for the client");

            Socket socket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            String message = (String) ois.readObject();
            System.out.println("Recieved: " + message);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("Hi client: " + message);
            ois.close();
            oos.close();
            // socket.close();
            if(message.equalsIgnoreCase("exit")) break;
            // serverSocket.close();
        }
    }
}
