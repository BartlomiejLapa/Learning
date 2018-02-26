import java.util.Scanner;
class EncodeData{
    String msg;
    String encmsg = "";
    String decmsg = "";
    String key = "AjeFEXsd346aFX";

    EncodeData(String msg){
        this.msg = msg;
    }

     String encrypt(){
        int j = 0;
        for(int i=0; i<msg.length (); i++){
            encmsg =  encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == key.length ()) j=0;
        }
       return encmsg;
    }

    String decrypt() {
         int j=0;
         for (int i=0; i<msg.length ();i++){
             decmsg = decmsg + (char)(encmsg.charAt (i) ^ key.charAt (j));
             j++;
             if (j == key.length ()) j=0;
         }
         return decmsg;
    }
}

public class Encode {
    public static void main (String args[]){
        String msg;

        System.out.println("Podaj tekst do zaszyfrowania ");

        Scanner read = new Scanner (System.in);
        msg = read.nextLine ();
        EncodeData message = new EncodeData (msg);


        System.out.println ("Wiadomość: " + msg + " Szyfrowana kluczem " + "\"" + message.key + "\"" +
                "\n Zaszyfrowana brzmi: " + "\"" + message.encrypt () + "\"");
        System.out.println ("\nWiadomosc odszyfrowana(kontrola): " + message.decrypt() );



    }
}
