public class Mail {

    String object;
    String body;

    public Mail(String object, String body){
        this.object = object;
        this.body = body;
    }

    public String getBody(){
        return this.body;
    }

    public String getObject(){
        return this.object;
    }
}


