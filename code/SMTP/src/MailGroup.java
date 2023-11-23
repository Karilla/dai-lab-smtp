import java.io.File;
import java.util.ArrayList;
import java.io.*;
import java.nio.charset.Charset;

public class MailGroup {
    private final File file;

    private final int peoplePerGroupe;


    public MailGroup(String file, int number){
        this.file = new File(file);
        this.peoplePerGroupe = number;
    }


    public ArrayList<ArrayList<String>> getMails(Charset encoding){

        ArrayList<ArrayList<String>> Mails = new ArrayList<>();

        try( var read = new BufferedReader(new InputStreamReader( new FileInputStream(file),encoding ))) {

            String line = read.readLine();
            int j = 0;
            while( line != null){
                Mails.add(new ArrayList<>());

                for(int i = 0 ; i < peoplePerGroupe; ++i){
                    Mails.get(j).add(line);

                    line = read.readLine();
                }

                ++j;

            }

            read.close();

            return Mails;

        } catch (IOException e) {
            System.out.println("Exception : " + e);
            return null;
        }


    }



}
