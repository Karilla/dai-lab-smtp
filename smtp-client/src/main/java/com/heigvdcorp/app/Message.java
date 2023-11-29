import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.

public class Message {

    Mail mail;




    private final File file;

    private ArrayList<String> messageList;

    public Message(String folder){
        this.file = new File(folder);
    }


    public ArrayList<String> getMessage(){

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Cest de la merde ");
        }
        return null;
    }




}
