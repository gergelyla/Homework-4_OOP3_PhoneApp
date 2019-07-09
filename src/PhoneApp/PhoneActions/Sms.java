package PhoneApp.PhoneActions;

public class Sms {
    long telNrSms;
    String messageBody;

    /////////////////////////////////////////////////////////////

    public Sms(long telNrSms, String messageBody){
        this.telNrSms=telNrSms;
        this.messageBody=messageBody;
    }

    /////////////////////////////////////////////////////////////

    public static void writeSms(){

    }

    public static void listSms(){

    }

    @Override
    public String toString() {
        return "Sms{" +
                "telNrSms=" + telNrSms +
                ", messageBody='" + messageBody + '\'' +
                '}';
    }
}
