import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


class TextualTCPClient {
    public static void main(String args[]) {

        MailGroup t = new MailGroup("../List/mail.txt",5);

        //ArrayList<ArrayList<String>>



        final int PORT = 1025;
        try (Socket socket = new Socket("localhost", PORT);
             var in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             var out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8))) {

            for (int i = 0; i < 10; i++) {
                // There are two errors here!
                out.write("Hello " + i);
                System.out.println("Echo: " + in.readLine());
            }
        } catch (IOException e) {
            System.out.println("Client: exception while using client socket: " + e);
        }



    }
}