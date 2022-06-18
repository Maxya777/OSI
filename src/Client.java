import java.io.*;
import java.net.Socket;
import static java.lang.System.out;

public class Client {

    public static void main(String[] args) throws IOException {

        String host = "127.0.0.1";
        int port = 8080;

        Socket socket = new Socket(host, port);


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream()), true)) {

            writer.println("Maxim");
            String resp = reader.readLine();
            out.println(resp);
        }
    }
}
