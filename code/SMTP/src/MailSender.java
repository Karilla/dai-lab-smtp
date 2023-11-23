import java.net.InetAddress;
import java.net.UnknownHostException;

public class MailSender {
    protected String localMachine;
    protected String localSMTPServer;
    private String textMail;

    private String mailFrom;

    public MailSender(String localSMTPServer, String mailFrom){

        try{

        }




        this.textMail = "null";
        this.localSMTPServer = localSMTPServer;
        this.mailFrom = mailFrom;

        InetAddress localIP = InetAddress.getLocalHost();

    }
}
