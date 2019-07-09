package PhoneApp.PhoneInventory;

import PhoneApp.PhoneActions.Call;
import PhoneApp.PhoneActions.Contact;
import PhoneApp.PhoneActions.Sms;

import java.util.ArrayList;

import static PhoneApp.Main.UserInputLong;
import static PhoneApp.PhoneInventory.SamsungS8.s8CallList;
import static PhoneApp.PhoneInventory.SamsungS8.s8ContactList;

public abstract class Phone implements MobileMethods{
    private String color;
    private String material;

    ////////////////////////////////////////////////////////////
    public Phone(){
    }

    public Phone(String color, String material){
        this.color=color;
        this.material=material;
    }

////////////////////////////////////////////////////////////

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



    public Contact newContact(int id,String firstName,String lastName, long phoneNumber) {
        Contact contact=new Contact(id,firstName, lastName, phoneNumber);
        return contact;
    }

    public void listContacts() {
    }

    public void sendMessage(){
    }

    public void listMessages(){
    }

    public void /*Call*/ makeCall(/*ArrayList contactList*/) {
        /*long calledNumber;
        boolean existingNumber=false;
        System.out.println("Enter number to call:");
        calledNumber=UserInputLong();
        for (int i=0; i<contactList.size();i++) {
            if (calledNumber == (contactList.get(i).getPhoneNr())) {
                System.out.println("You are calling the number " + calledNumber);
                Call call = new Call(calledNumber, "5 minutes");
                existingNumber=true;
                //samsungS8_1.batteryLifeHours()=samsungS8_1.batterylifeHours-1;
                break;
            }
        }
        if (existingNumber!=true){System.out.println("No such number in the contact list!");}
        return call;*/
    }

    public void listCalls(){
    }

}
