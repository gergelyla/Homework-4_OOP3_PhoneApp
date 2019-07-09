package PhoneApp.PhoneActions;

public class Call {
    long telNrCall;
    String callLengthMinutes;

    ///////////////////////////////////////////////////////////////////

    public Call(long telNrCall, String callLengthMinutes){
        this.telNrCall=telNrCall;
        this.callLengthMinutes=callLengthMinutes;
    }

    ///////////////////////////////////////////////////////////////////

    public static void makeCall(){

    }

    public static void listCalls(){

    }

    @Override
    public String toString() {
        return "Call{" +
                "telNrCall=" + telNrCall +
                ", callLengthMinutes='" + callLengthMinutes + '\'' +
                '}';
    }
}
