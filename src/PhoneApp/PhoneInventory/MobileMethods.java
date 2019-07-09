package PhoneApp.PhoneInventory;

import PhoneApp.PhoneActions.Call;
import PhoneApp.PhoneActions.Contact;

import java.util.ArrayList;

public interface MobileMethods {
    public Contact newContact(int id,String firstName, String lastName,long phoneNumber);
    void listContacts();
    void sendMessage();
    void listMessages();
    public void /*Call*/ makeCall(/*ArrayList contactList*/);
    void listCalls();
}
